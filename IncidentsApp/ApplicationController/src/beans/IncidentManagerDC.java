package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.adf.model.datacontrols.device.DeviceManager;
import oracle.adf.model.datacontrols.device.DeviceManagerFactory;

import oracle.adfmf.bindings.dbf.AmxAttributeBinding;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;
import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.java.beans.ProviderChangeListener;
import oracle.adfmf.java.beans.ProviderChangeSupport;

public class IncidentManagerDC {

    private Incident[] incidents;
    private Incident newIncident = new Incident();
    private Incident selectedIncident = new Incident();
    private String idIncidente;
    private Attention[] attentions;

    public void setAttentions(Attention[] attentions) {
        this.attentions = attentions;
    }

    public Attention[] getAttentions() {
        return attentions;
    }

    public void setIdIncidente(String idIncidente) {
        this.idIncidente = idIncidente;
        for (int i=0;i<incidents.length;i++){
            if (incidents[i].getIncident_id().equals(idIncidente)){
                attentions=incidents[i].getAttentions();
                providerChangeSupport.fireProviderRefresh("attentions");
                break;
            }
        }
    }

    public String getIdIncidente() {
        return idIncidente;
    }

    public void setSelectedIncident(Incident selectedIncident) {
        this.selectedIncident = selectedIncident;
    }

    public Incident getSelectedIncident() {
        return selectedIncident;
    }
    private String imagePhoto = "";
    private String [] categories={"IT","DATABASE","Middleware","Finance"};

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setImagePhoto(String imagePhoto) {
        this.imagePhoto = imagePhoto;
    }

    public String getImagePhoto() {
        return imagePhoto;
    }

    public void setNewIncident(Incident newIncident) {
        this.newIncident = newIncident;
    }

    public Incident getNewIncident() {
        return newIncident;
    }
    private String pEmployee_id = "133";
    protected transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);
    private transient PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void setIncidents(Incident[] incidents) {
        this.incidents = incidents;
    }

    public Incident[] getIncidents() {
        return incidents;
    }

    public IncidentManagerDC() {
        super();
        //loadIncidents();
    }


    public void loadIncidents() {
        List IncidentListResult = WSHelper.getIncidentsByEmployeId(newIncident.getEmployee_id());
        incidents = (Incident[]) IncidentListResult.toArray(new Incident[IncidentListResult.size()]);
        providerChangeSupport.fireProviderRefresh("incidents");
    }

    public void createIncident(String employee_id, Date request_date, String category_name, String description) {
        WSHelper.createIncidentsByEmployeId(newIncident.getEmployee_id(), employee_id, request_date, category_name,
                                            description);
        clearInputs();
        loadIncidents();

    }

    public void getPicture() {
        //destinationType = 1 so that the image is returned as a filename

        String theImage =
            DeviceManagerFactory.getDeviceManager().getPicture(100, DeviceManager.CAMERA_DESTINATIONTYPE_FILE_URI,
                                                               DeviceManager.CAMERA_SOURCETYPE_CAMERA, false,
                                                               DeviceManager.CAMERA_ENCODINGTYPE_PNG, 400, 400);
        
        
        
        String oldvalue = imagePhoto;
        this.imagePhoto = theImage;
        propertyChangeSupport.firePropertyChange("imagePhoto", oldvalue, theImage);
        //return theImage;
    }

    public void addProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.addProviderChangeListener(l);
    }

    public void removeProviderChangeListener(ProviderChangeListener l) {
        providerChangeSupport.removeProviderChangeListener(l);
    }
    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }


    private void clearInputs() {

        //AmxAttributeBinding custEmployee_id =
        //    (AmxAttributeBinding) AdfmfJavaUtilities.evaluateELExpression("#{bindings.employee_id}");
        AmxAttributeBinding custDate =
            (AmxAttributeBinding) AdfmfJavaUtilities.evaluateELExpression("#{bindings.date}");
        //AmxAttributeBinding custCategory_name =
            //(AmxAttributeBinding) AdfmfJavaUtilities.evaluateELExpression("#{bindings.category_name}");
        AmxAttributeBinding custDescription =
            (AmxAttributeBinding) AdfmfJavaUtilities.evaluateELExpression("#{bindings.description}");
        AmxAttributeBinding custImagePhoto =
            (AmxAttributeBinding) AdfmfJavaUtilities.evaluateELExpression("#{bindings.imagePhoto}");
        //custEmployee_id.setInputValue("");
        custDate.setInputValue(null);
       // custCategory_name.setInputValue("");
        custDescription.setInputValue("");
        custImagePhoto.setInputValue("");
    }
}
