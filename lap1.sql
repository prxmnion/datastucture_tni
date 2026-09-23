select * from jobs;

select DEPARTMENTS_NAME
from departments;

select employee_id , first_name
from employees;

SELECT department_id, location_id
FROM departments;

SELECT employee_id, first_name, last_name
FROM employees;

SELECT first_name, salary, salary+300
FROM employees;

select job_id,job_title,min_salary,min_salary*0.5 + min_salary"Min Salary"
from jobs;

SELECT last_name,job_id,salary,commission_pct,salary*commission_pct
FROM employees;

SELECT last_name AS"name",commission_pct comm
FROM employees;

SELECT first_name, last_name,
first_name||' ** ' ||last_name "Name"
FROM employees;

select employee_id code , first_name as "Emp Name",salary*12 as "Annual salary"
from employees;






