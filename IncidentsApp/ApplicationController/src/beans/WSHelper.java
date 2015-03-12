package beans;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.adfmf.bindings.dbf.AmxAttributeBinding;
import oracle.adfmf.dc.ws.rest.RestServiceAdapter;
import oracle.adfmf.framework.api.AdfmfContainerUtilities;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;
import oracle.adfmf.framework.api.JSONBeanSerializationHelper;
import oracle.adfmf.framework.api.Model;
import oracle.adfmf.json.JSONArray;
import oracle.adfmf.json.JSONObject;


public class WSHelper {


    public WSHelper() {
        super();
    }


    public static List<Incident> getIncidentsByEmployeId(String pEmployee_id) {
        String httpMethod = RestServiceAdapter.REQUEST_TYPE_GET;
        String requestURI = "/incidents" + "?employee_id=" + pEmployee_id;
        String payload = "";

        
        List listResult= new ArrayList();
        try {
            String response = "No data";


            RestServiceAdapter restServiceAdapter = Model.createRestServiceAdapter();
            restServiceAdapter.clearRequestProperties();
            restServiceAdapter.setConnectionName("Incident");
            restServiceAdapter.setRequestType(httpMethod);
            restServiceAdapter.addRequestProperty("Content-Type", "application/json");
            restServiceAdapter.addRequestProperty("Accept", "application/json; charset=UTF-8");
            restServiceAdapter.setRequestURI(requestURI);
            restServiceAdapter.setRetryLimit(0);


            response = (String) restServiceAdapter.send(payload);
            response=response.trim();

            int responseStatus = restServiceAdapter.getResponseStatus();
            if (responseStatus == 200) {
                JSONArray incidentes = null;
                JSONBeanSerializationHelper jbsh = new JSONBeanSerializationHelper();
                //incidentes = (JSONObject) jbsh.fromJSON(JSONObject.class, response);
                //incidentes = (JSONArray) jbsh.fromJSON(JSONObject.class, response);
                incidentes=new JSONArray(response);
                
                for (int i=0;i<incidentes.length();i++){
                    JSONObject incidente=(JSONObject)incidentes.get(i);
                    listResult.add(new Incident(incidente));
                    
                }
                

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return listResult;
    }

    static void createIncidentsByEmployeId(String pEmployee_id, String employee_id, Date request_date, String category_name, String description) {
        String httpMethod = RestServiceAdapter.REQUEST_TYPE_POST;
        String requestURI = "/incidents";
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        
               
        String payload = "{\"employee_id\":"+pEmployee_id+",\"request_date\":\""+dt1.format(request_date)+"\",\"category_name\":\""+category_name+"\",\"description\":\"" + description+"\"}";

        
        List listResult= new ArrayList();
        try {
            String response = "No data";


            RestServiceAdapter restServiceAdapter = Model.createRestServiceAdapter();
            restServiceAdapter.clearRequestProperties();
            restServiceAdapter.setConnectionName("Incident");
            restServiceAdapter.setRequestType(httpMethod);
            restServiceAdapter.addRequestProperty("Content-Type", "application/json");
            restServiceAdapter.addRequestProperty("Accept", "application/json");
            restServiceAdapter.setRequestURI(requestURI);
            restServiceAdapter.setRetryLimit(0);


            response = (String) restServiceAdapter.send(payload);
            response=response.trim();

            int responseStatus = restServiceAdapter.getResponseStatus();
            if (responseStatus == 200) {
                System.out.println("Success");
                

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
