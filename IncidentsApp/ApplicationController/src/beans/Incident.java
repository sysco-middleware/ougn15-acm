package beans;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import oracle.adfmf.json.JSONArray;
import oracle.adfmf.json.JSONException;
import oracle.adfmf.json.JSONObject;

public class Incident {

    private String incident_id;
    private String employee_id;
    private String request_date;
    private String category_name;
    private String description;
    private String current_status;
    private Attention[] attentions;
    private Date date;
    private String blank = "";

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public String getBlank() {
        return blank;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Incident() {
        super();
    }

    Incident(JSONObject incidente) throws JSONException {
        incident_id = incidente.getInt("incident_id") + "";
        employee_id = incidente.getInt("employee_id") + "";
        request_date = incidente.getString("request_date");
        category_name = incidente.getString("category_name");
        description = incidente.getString("description");
        current_status = incidente.getString("current_status");

        if (incidente.has("attentions")) {
            JSONArray atenciones = incidente.getJSONArray("attentions");
            attentions = new Attention[atenciones.length()];
            for (int i = 0; i < atenciones.length(); i++) {
                JSONObject atencion=(JSONObject)atenciones.get(i);
                attentions[i]=new Attention(atencion);

            }
        }

    }

    public void setIncident_id(String incident_id) {
        this.incident_id = incident_id;
    }

    public String getIncident_id() {
        return incident_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

    public String getRequest_date() {
        if (request_date.indexOf("T") != -1) {
            request_date = request_date.substring(0, request_date.indexOf("T"));
        }
        return request_date;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCurrent_status(String current_status) {
        this.current_status = current_status;
    }

    public String getCurrent_status() {
        return current_status;
    }

    public void setAttentions(Attention[] attentions) {
        this.attentions = attentions;
    }

    public Attention[] getAttentions() {
        return attentions;
    }


}
