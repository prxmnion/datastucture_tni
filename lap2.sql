select *
from employees
where department_id = 90;

select employee_id, last_name, job_id, department_id dap
from employees
where department_id = 90;

select job_id, job_title, max_salary *12 as max_salary
from jobs
where max_salary *12 = 240960;

select last_name, job_id, department_id
from employees
where last_name = 'Whalen';

select last_name
from employees
where hire_date = '17-feb-04';

select last_name, salary
from employees
where salary <= 3000;

select first_name, hire_date
from employees
where hire_date < '1-jun-04';

select last_name, salary
from employees
where salary between 2500 and 3500;

select last_name
from employees
where last_name between 'King' and 'Smith';

select employee_id, last_name, salary, manager_id
from employees
where manager_id IN (100,101,201);
--where manager_id = 100 or manager_id = 101 or manager_id = 102*/

select * 
from employees
where rownum <= 3;

SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE salary > 10000
AND job_id LIKE '%MAN%';

select employee_id, manager_id, deperment_id
from employees
where last_name

select first_name
from employees
where first_name like 'S%';

select last_name
from employees
where last_name like '_%';

select last_name, hire_date
from employees
where hire_date link '%03';
--where hire_id between '1-jan-03' and '31-dec-03';

select employee_id, last_name, job_id
from employees
where job_id link 'SA\_%' ; escape '\' ; 
--job_id link 'SA_%'

SELECT last_name, manager_id
FROM employees
WHERE manager_id IS NULL;

select last_name, job_id,commission_pct
from employees
where commission_pct is null
and job_id like 'AD\_' ;

SELECT last_name, job_id, department_id, hire_date
FROM employees
ORDER BY hire_date desc;

SELECT employee_id, last_name, salary*12 annsal
FROM employees
ORDER BY annsal;

SELECT last_name, job_id, department_id, hire_date
FROM employees
ORDER BY 3;

SELECT *
FROM employees
ORDER BY 8;

SELECT last_name, department_id, salary
FROM employees
ORDER BY department_id, salary DESC;

SELECT employee_id, last_name, salary
FROM employees
WHERE employee_id = &employee_num;

select last_id, depertment_id
from employees
where depertment_id in(20,50);
order by 1;


select last_name,depertment_id
from employees
where depertment_id in (20,50)
order by 1;

select employee_id, last_name, salary
from employees
where employee_id = &employee_num;


SELECT last_name, department_id, salary*12
FROM employees
WHERE job_id = '&job_title';


SELECT employee_id, &column_name
FROM employees
WHERE &condition
ORDER BY &order_column;

select job_id,min_salary
from jobs
where &condition_user
order by &column_to_order;


SELECT employee_id, last_name, job_id,
    &&column_name
FROM employees
ORDER BY &column_name;

undefine comlumn_name;

SELECT employee_id, last_name, job_id,
    &&column_name
FROM employees
where &column_name is not null
ORDER BY &column_name desc;

undefine comlumn_name;


DEFINE employee_num = 200;
SELECT employee_id, last_name, salary, department_id
FROM employees
WHERE employee_id = &employee_num;


SELECT 'The job id for ' || UPPER(last_name) || 
' is ' || LOWER(job_id) AS "EMPLOYEE DETAILS"
FROM employees;


SELECT employee_id, last_name, department_id
FROM employees
WHERE initcap(last_name) = 'higgins';


select substr('HelloWord',1,5),
SUBSTR('HelloWord',6)
from dual;

select instr('HelloWord', 'z')
from dual;


select employee_id, 
concat(concat(first_name,' ')last_naame)NAME, 
job_id,
length(last_name),
instr(last_name,'a') "Contains 'a'?"
from employees
where substr(job_id,4) = 'REP';
--where last_name link '%n' ;
--where substr(last_name,-) ='n';


SELECT LPAD('5000', 10, '*')
RPAD('5000', 10, '*')
FROM dual;


SELECT RPAD('5000', 10, '*')
FROM dual;


select first_name,
   rpad(first_name,20,' ') first_name1,
   lpad(first_name,20,'*') first_name2,
from employees


select mod(1600, 300) ,
mod(300, 1600)
from dual ;


SELECT ROUND(67830.4557, 3),
ROUND(67830.4557, -4),
ROUND(67830.4557, -2)
FROM dual;


SELECT TRUNC(67830.4557, 3),
TRUNC(67830.4557, 2),
TRUNC(67830.4557,-3)
FROM dual;


select last_name, salary, 
mod(salary,5000) "Mod Salary"
from employees
where job_id = 'SA_REP';


select  SYSDATE --วันปัจจุบน
from dual;


select last_name, trunc(SYSDATE-hire_date) "date",
trunc((SYSDATE-hire_date)/7) AS WEEKS
       (SYSDATE-hire_date)/30 as month
    month_between(sysdate,hire_date) month
from employees
where department_id = 90;


select employee_id, hire_date,
add_months(hire_date,6) review,
next_day(hire_date, 'friday' )"NEXT HIredate",
last_day(hire_date) "Last Hiredate",
months_between(sysdate, hire_date) tenure
from employees
where months_between(sysdate, hire_date) > 280;


select departmant_id, department_name, location_id 
from departments
where department_id = &dept;
