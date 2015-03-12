xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare namespace ns2="http://sysco.no/IncidentsResource_ReportIncident_request";
(:: import schema at "IncidentsResource.xsd" ::)
declare namespace ns1="http://xmlns.oracle.com/pcbpel/adapter/db/top/IncidentsDB";
(:: import schema at "IncidentsDB_table.xsd" ::)

declare variable $incidentsCollection as element() (:: schema-element(ns1:IncidentsCollection) ::) external;

declare function local:func($incidentsCollection as element() (:: schema-element(ns1:IncidentsCollection) ::)) as element() (:: schema-element(ns2:incidents) ::) {
    <ns2:incidents>
        {
            for $Incidents in $incidentsCollection/ns1:Incidents
            return 
            <ns2:topLevelArray>
                <ns2:incident_id>{fn:data($Incidents/ns1:incidentId)}</ns2:incident_id>
                <ns2:employee_id>{fn:data($Incidents/ns1:employeeId)}</ns2:employee_id>
                <ns2:request_date>{fn:data($Incidents/ns1:requestDate)}</ns2:request_date>
                <ns2:category_name>{fn:data($Incidents/ns1:categoryName)}</ns2:category_name>
                <ns2:description>{fn:data($Incidents/ns1:description)}</ns2:description>
                <ns2:current_status>{fn:data($Incidents/ns1:currentStatus)}</ns2:current_status>
                { for $IncidentsAttention in $Incidents/ns1:incidentAttentionsCollection/ns1:IncidentAttentions
                  return
                  <ns2:attentions>
                      <ns2:incident_attention_id>{fn:data($IncidentsAttention/ns1:incidentAttentionId)}</ns2:incident_attention_id>
                      <ns2:attention_date>{fn:data($IncidentsAttention/ns1:attentionDate)}</ns2:attention_date>
                      <ns2:actions>{fn:data($IncidentsAttention/ns1:actions)}</ns2:actions>
                      <ns2:username>{fn:data($IncidentsAttention/ns1:username)}</ns2:username>
                  </ns2:attentions>
                }
            </ns2:topLevelArray>
        }
    </ns2:incidents>
};

local:func($incidentsCollection)
