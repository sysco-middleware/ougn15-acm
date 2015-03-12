xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare namespace ns2="http://xmlns.oracle.com/CaseService/types";
(:: import schema at "../IncidentManagementProcess.serviceCaseService.xsd" ::)
declare namespace ns1="http://xmlns.oracle.com/pcbpel/adapter/db/top/IncidentsDB";
(:: import schema at "IncidentsDB_table.xsd" ::)

declare namespace cas = "http://xmlns.oracle.com/bpm/case";

declare namespace ext = "http://xmlns.oracle.com/bpm/case/metadata/extension";

declare variable $incident as element() (:: schema-element(ns1:IncidentsCollection) ::) external;

declare function local:func($incident as element() (:: schema-element(ns1:IncidentsCollection) ::)) as element() (:: schema-element(ns2:startCaseInputMessage) ::) {
    <ns2:startCaseInputMessage>
        <cas:case>
            <ext:documentation/>
            <cas:caseId></cas:caseId>
            <cas:caseHeader>
            </cas:caseHeader>
            <cas:data>
                <cas:name>incident</cas:name>
                <cas:data>
                  <Incident 
                      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                      xmlns="http://xmlns.oracle.com/bpm/bpmobject/Data/Incident">
                      <incidentId>{data($incident/ns1:Incidents/ns1:incidentId)}</incidentId>
                  </Incident>
                </cas:data>
            </cas:data>
        </cas:case>
    </ns2:startCaseInputMessage>
};

local:func($incident)
