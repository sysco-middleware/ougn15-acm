xquery version "1.0" encoding "utf-8";

(:: OracleAnnotationVersion "1.0" ::)

declare namespace ns1="http://xmlns.oracle.com/pcbpel/adapter/db/top/IncidentsDB";
(:: import schema at "IncidentsDB_table.xsd" ::)

declare variable $employee_id as xs:string external;

declare function local:func($employee_id as xs:string) as element() (:: schema-element(ns1:Incidents) ::) {
    <ns1:Incidents>
        <ns1:employeeId>{fn:data($employee_id)}</ns1:employeeId>
    </ns1:Incidents>
};

local:func($employee_id)
