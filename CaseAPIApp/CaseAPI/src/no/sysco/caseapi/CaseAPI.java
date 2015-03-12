package no.sysco.caseapi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.HashMap;
import java.util.Map;

import oracle.bpel.services.bpm.common.IBPMContext;
import oracle.bpel.services.workflow.client.IWorkflowServiceClientConstants;

import oracle.bpm.casemgmt.CaseIdentifier;
import oracle.bpm.casemgmt.CaseServiceException;
import oracle.bpm.casemgmt.ICaseStreamService;
import oracle.bpm.client.BPMServiceClientFactory;
import oracle.bpm.services.common.exception.BPMException;

public class CaseAPI {
    private static final String SOA_T3_URL = "t3://ougn15-acm:7011";
    private static final String USERNAME = "weblogic";
    private static final String PASSWORD = "welcome1";

    public CaseAPI() {
        super();
    }

    public BPMServiceClientFactory createConnectionFactory() {
        System.out.println("Trying to connect to SOA Server...");

        Map<IWorkflowServiceClientConstants.CONNECTION_PROPERTY, String> properties =
            new HashMap<IWorkflowServiceClientConstants.CONNECTION_PROPERTY, String>();
        properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.CLIENT_TYPE,
                       BPMServiceClientFactory.REMOTE_CLIENT);
        properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.EJB_PROVIDER_URL, SOA_T3_URL);
        properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.EJB_SECURITY_PRINCIPAL, USERNAME);
        properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.EJB_SECURITY_CREDENTIALS, PASSWORD);

        System.out.println("Connected to SOA Server...");

        return BPMServiceClientFactory.getInstance(properties, "default", null);

    }

    public IBPMContext authenticate(BPMServiceClientFactory serviceClientFactory, String username,
                                    String password) throws BPMException {
        System.out.println("Trying to connect as a BPM User...");
        return serviceClientFactory.getBPMUserAuthenticationService().authenticate(username, password.toCharArray(),
                                                                                   "jazn.com");
    }

    public void saveCaseDocument(IBPMContext context, BPMServiceClientFactory serviceClientFactory,
                                 String caseIdentificationKey, String documentName, String mimeType,
                                 String documentPath, String comments, String permissionTag) {
        ICaseStreamService caseStreamService =
            serviceClientFactory.getCaseManagementServiceClient().getCaseStreamServiceClient();
        try (InputStream documentStream = new FileInputStream(documentPath)) {
            System.out.println("Trying to upload a document...");
            caseStreamService.uploadDocument(context,
                                             CaseIdentifier.getCaseIdentifierBasedOnCaseId(caseIdentificationKey),
                                             documentName, mimeType, documentStream, comments, permissionTag);

            System.out.println("Document uploaded");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CaseServiceException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(@SuppressWarnings("unused") String[] args) throws BPMException, CaseServiceException {
        CaseAPI api = new CaseAPI();

        BPMServiceClientFactory serviceClientFactory = api.createConnectionFactory();
        IBPMContext context = api.authenticate(serviceClientFactory, "weblogic", "welcome1");
        api.saveCaseDocument(context, serviceClientFactory, "0dacfb0e-1b24-450c-bd37-5dd6d8c9a97b", "Incident.jpg",
                             MimeType.IMAGE_JPEG.get(),
                             "C:\\Users\\JorgeEsteban\\dev\\sysco\\labs\\lab-ougn15-acm\\Images\\images.jpg",
                             "Someone is using my laptop", null);
    }
}
