package beans;

import oracle.adfmf.json.JSONException;
import oracle.adfmf.json.JSONObject;

public class Attention {
    
    private String incident_attention_id;
    private String attention_date;
    private String actions;
    private String username;

    public Attention(){
        
    }

    public Attention(JSONObject atencion) throws JSONException {
        incident_attention_id = atencion.getInt("incident_attention_id") + "";
        attention_date = atencion.getString("attention_date");
        actions = atencion.getString("actions");
        username = atencion.getString("username");
        
    }

    public void setIncident_attention_id(String incident_attention_id) {
        this.incident_attention_id = incident_attention_id;
    }

    public String getIncident_attention_id() {
        return incident_attention_id;
    }

    public void setAttention_date(String attention_date) {
        this.attention_date = attention_date;
    }

    public String getAttention_date() {
        if (attention_date.indexOf("T") != -1) {
            attention_date = attention_date.substring(0, attention_date.indexOf("T"));
        }
        return attention_date;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getActions() {
        return actions;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


}
