xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare namespace ns1="http://sysco.no/IncidentsResource_ReportIncident_request";
(:: import schema at "IncidentResource.xsd" ::)
declare namespace ns2="http://xmlns.oracle.com/pcbpel/adapter/db/top/IncidentsDB";
(:: import schema at "IncidentsDB_table.xsd" ::)

declare variable $incident_resource as element() (:: schema-element(ns1:incident) ::) external;

declare function local:func($incident_resource as element() (:: schema-element(ns1:incident) ::)) as element() (:: schema-element(ns2:IncidentsCollection) ::) {
    <ns2:IncidentsCollection>
        <ns2:Incidents>
            <ns2:employeeId>{fn:data($incident_resource/ns1:topLevelArray/ns1:employee_id)}</ns2:employeeId>
            <ns2:requestDate>{fn:data($incident_resource/ns1:topLevelArray/ns1:request_date)}</ns2:requestDate>
            <ns2:categoryName>{fn:data($incident_resource/ns1:topLevelArray/ns1:category_name)}</ns2:categoryName>
            <ns2:description>{fn:data($incident_resource/ns1:topLevelArray/ns1:description)}</ns2:description>
            <ns2:currentStatus>NEW</ns2:currentStatus>
        </ns2:Incidents>
    </ns2:IncidentsCollection>
};

local:func($incident_resource)
