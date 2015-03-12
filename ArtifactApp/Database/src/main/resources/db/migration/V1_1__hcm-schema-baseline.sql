CREATE TABLE HCM.COUNTRIES 
(
  COUNTRY_ID CHAR(2 BYTE) NOT NULL 
, COUNTRY_NAME VARCHAR2(40 BYTE) 
, REGION_ID NUMBER 
, CONSTRAINT COUNTRY_C_ID_PK PRIMARY KEY 
  (
    COUNTRY_ID 
  )
  ENABLE 
) ;

CREATE TABLE HCM.DEPARTMENTS 
(
  DEPARTMENT_ID NUMBER(4, 0) NOT NULL 
, DEPARTMENT_NAME VARCHAR2(30 BYTE) NOT NULL 
, MANAGER_ID NUMBER(6, 0) 
, LOCATION_ID NUMBER(4, 0) 
) ;

CREATE TABLE HCM.EMPLOYEES 
(
  EMPLOYEE_ID NUMBER(6, 0) NOT NULL 
, FIRST_NAME VARCHAR2(20 BYTE) 
, LAST_NAME VARCHAR2(25 BYTE) NOT NULL 
, EMAIL VARCHAR2(25 BYTE) NOT NULL 
, PHONE_NUMBER VARCHAR2(20 BYTE) 
, HIRE_DATE DATE NOT NULL 
, JOB_ID VARCHAR2(10 BYTE) NOT NULL 
, SALARY NUMBER(8, 2) 
, COMMISSION_PCT NUMBER(2, 2) 
, MANAGER_ID NUMBER(6, 0) 
, DEPARTMENT_ID NUMBER(4, 0) 
) ;

CREATE TABLE HCM.JOBS 
(
  JOB_ID VARCHAR2(10 BYTE) NOT NULL 
, JOB_TITLE VARCHAR2(35 BYTE) NOT NULL 
, MIN_SALARY NUMBER(6, 0) 
, MAX_SALARY NUMBER(6, 0) 
) ;

CREATE TABLE HCM.JOB_HISTORY 
(
  EMPLOYEE_ID NUMBER(6, 0) NOT NULL 
, START_DATE DATE NOT NULL 
, END_DATE DATE NOT NULL 
, JOB_ID VARCHAR2(10 BYTE) NOT NULL 
, DEPARTMENT_ID NUMBER(4, 0) 
) ;

CREATE TABLE HCM.LOCATIONS 
(
  LOCATION_ID NUMBER(4, 0) NOT NULL 
, STREET_ADDRESS VARCHAR2(40 BYTE) 
, POSTAL_CODE VARCHAR2(12 BYTE) 
, CITY VARCHAR2(30 BYTE) NOT NULL 
, STATE_PROVINCE VARCHAR2(25 BYTE) 
, COUNTRY_ID CHAR(2 BYTE) 
) ;

CREATE TABLE HCM.REGIONS 
(
  REGION_ID NUMBER NOT NULL 
, REGION_NAME VARCHAR2(25 BYTE) 
) ;


COMMENT ON TABLE HCM.COUNTRIES IS 'country table. Contains 25 rows. References with locations table.';

COMMENT ON TABLE HCM.DEPARTMENTS IS 'Departments table that shows details of departments where employees
work. Contains 27 rows; references with locations, employees, and job_history tables.';

COMMENT ON TABLE HCM.EMPLOYEES IS 'employees table. Contains 107 rows. References with departments,
jobs, job_history tables. Contains a self reference.';

COMMENT ON TABLE HCM.JOBS IS 'jobs table with job titles and salary ranges. Contains 19 rows.
References with employees and job_history table.';

COMMENT ON TABLE HCM.JOB_HISTORY IS 'Table that stores job history of the employees. If an employee
changes departments within the job or changes jobs within the department,
new rows get inserted into this table with old job information of the
employee. Contains a complex primary key: employee_id+start_date.
Contains 25 rows. References with jobs, employees, and departments tables.';

COMMENT ON TABLE HCM.LOCATIONS IS 'Locations table that contains specific address of a specific office,
warehouse, and/or production site of a company. Does not store addresses /
locations of customers. Contains 23 rows; references with the
departments and countries tables. ';

COMMENT ON COLUMN HCM.COUNTRIES.COUNTRY_ID IS 'Primary key of countries table.';

COMMENT ON COLUMN HCM.COUNTRIES.COUNTRY_NAME IS 'Country name';

COMMENT ON COLUMN HCM.COUNTRIES.REGION_ID IS 'Region ID for the country. Foreign key to region_id column in the departments table.';

COMMENT ON COLUMN HCM.DEPARTMENTS.DEPARTMENT_ID IS 'Primary key column of departments table.';

COMMENT ON COLUMN HCM.DEPARTMENTS.DEPARTMENT_NAME IS 'A not null column that shows name of a department. Administration,
Marketing, Purchasing, Human Resources, Shipping, IT, Executive, Public
Relations, Sales, Finance, and Accounting. ';

COMMENT ON COLUMN HCM.DEPARTMENTS.MANAGER_ID IS 'Manager_id of a department. Foreign key to employee_id column of employees table. The manager_id column of the employee table references this column.';

COMMENT ON COLUMN HCM.DEPARTMENTS.LOCATION_ID IS 'Location id where a department is located. Foreign key to location_id column of locations table.';

COMMENT ON COLUMN HCM.EMPLOYEES.EMPLOYEE_ID IS 'Primary key of employees table.';

COMMENT ON COLUMN HCM.EMPLOYEES.FIRST_NAME IS 'First name of the employee. A not null column.';

COMMENT ON COLUMN HCM.EMPLOYEES.LAST_NAME IS 'Last name of the employee. A not null column.';

COMMENT ON COLUMN HCM.EMPLOYEES.EMAIL IS 'Email id of the employee';

COMMENT ON COLUMN HCM.EMPLOYEES.PHONE_NUMBER IS 'Phone number of the employee; includes country code and area code';

COMMENT ON COLUMN HCM.EMPLOYEES.HIRE_DATE IS 'Date when the employee started on this job. A not null column.';

COMMENT ON COLUMN HCM.EMPLOYEES.JOB_ID IS 'Current job of the employee; foreign key to job_id column of the
jobs table. A not null column.';

COMMENT ON COLUMN HCM.EMPLOYEES.SALARY IS 'Monthly salary of the employee. Must be greater
than zero (enforced by constraint emp_salary_min)';

COMMENT ON COLUMN HCM.EMPLOYEES.COMMISSION_PCT IS 'Commission percentage of the employee; Only employees in sales
department elgible for commission percentage';

COMMENT ON COLUMN HCM.EMPLOYEES.MANAGER_ID IS 'Manager id of the employee; has same domain as manager_id in
departments table. Foreign key to employee_id column of employees table.
(useful for reflexive joins and CONNECT BY query)';

COMMENT ON COLUMN HCM.EMPLOYEES.DEPARTMENT_ID IS 'Department id where employee works; foreign key to department_id
column of the departments table';

COMMENT ON COLUMN HCM.JOBS.JOB_ID IS 'Primary key of jobs table.';

COMMENT ON COLUMN HCM.JOBS.JOB_TITLE IS 'A not null column that shows job title, e.g. AD_VP, FI_ACCOUNTANT';

COMMENT ON COLUMN HCM.JOBS.MIN_SALARY IS 'Minimum salary for a job title.';

COMMENT ON COLUMN HCM.JOBS.MAX_SALARY IS 'Maximum salary for a job title';

COMMENT ON COLUMN HCM.JOB_HISTORY.EMPLOYEE_ID IS 'A not null column in the complex primary key employee_id+start_date.
Foreign key to employee_id column of the employee table';

COMMENT ON COLUMN HCM.JOB_HISTORY.START_DATE IS 'A not null column in the complex primary key employee_id+start_date.
Must be less than the end_date of the job_history table. (enforced by
constraint jhist_date_interval)';

COMMENT ON COLUMN HCM.JOB_HISTORY.END_DATE IS 'Last day of the employee in this job role. A not null column. Must be
greater than the start_date of the job_history table.
(enforced by constraint jhist_date_interval)';

COMMENT ON COLUMN HCM.JOB_HISTORY.JOB_ID IS 'Job role in which the employee worked in the past; foreign key to
job_id column in the jobs table. A not null column.';

COMMENT ON COLUMN HCM.JOB_HISTORY.DEPARTMENT_ID IS 'Department id in which the employee worked in the past; foreign key to deparment_id column in the departments table';

COMMENT ON COLUMN HCM.LOCATIONS.LOCATION_ID IS 'Primary key of locations table';

COMMENT ON COLUMN HCM.LOCATIONS.STREET_ADDRESS IS 'Street address of an office, warehouse, or production site of a company.
Contains building number and street name';

COMMENT ON COLUMN HCM.LOCATIONS.POSTAL_CODE IS 'Postal code of the location of an office, warehouse, or production site
of a company. ';

COMMENT ON COLUMN HCM.LOCATIONS.CITY IS 'A not null column that shows city where an office, warehouse, or
production site of a company is located. ';

COMMENT ON COLUMN HCM.LOCATIONS.STATE_PROVINCE IS 'State or Province where an office, warehouse, or production site of a
company is located.';

COMMENT ON COLUMN HCM.LOCATIONS.COUNTRY_ID IS 'Country where an office, warehouse, or production site of a company is
located. Foreign key to country_id column of the countries table.';

CREATE SEQUENCE HCM.DEPARTMENTS_SEQ INCREMENT BY 10 MAXVALUE 9990 MINVALUE 1 NOCACHE;

CREATE SEQUENCE HCM.EMPLOYEES_SEQ INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 NOCACHE;

CREATE SEQUENCE HCM.LOCATIONS_SEQ INCREMENT BY 100 MAXVALUE 9900 MINVALUE 1 NOCACHE;

CREATE PROCEDURE HCM.ADD_JOB_HISTORY 
  (  p_emp_id          job_history.employee_id%type
   , p_start_date      job_history.start_date%type
   , p_end_date        job_history.end_date%type
   , p_job_id          job_history.job_id%type
   , p_department_id   job_history.department_id%type
   )
IS
BEGIN
  INSERT INTO job_history (employee_id, start_date, end_date,
                           job_id, department_id)
    VALUES(p_emp_id, p_start_date, p_end_date, p_job_id, p_department_id);
END add_job_history;
/

CREATE PROCEDURE HCM.SECURE_DML 
IS
BEGIN
  IF TO_CHAR (SYSDATE, 'HH24:MI') NOT BETWEEN '08:00' AND '18:00'
        OR TO_CHAR (SYSDATE, 'DY') IN ('SAT', 'SUN') THEN
	RAISE_APPLICATION_ERROR (-20205,
		'You may only make changes during normal office hours');
  END IF;
END secure_dml;
/

CREATE TRIGGER HCM.SECURE_EMPLOYEES 
  BEFORE INSERT OR UPDATE OR DELETE ON "HCM".employees
BEGIN
  secure_dml;
END secure_employees;
/

CREATE TRIGGER HCM.UPDATE_JOB_HISTORY 
  AFTER UPDATE OF job_id, department_id ON "HCM".employees
  FOR EACH ROW
BEGIN
  add_job_history(:old.employee_id, :old.hire_date, sysdate,
                  :old.job_id, :old.department_id);
END;
/

ALTER TRIGGER HCM.SECURE_EMPLOYEES DISABLE;
