-- chater 4 
select employee_id,TO_CHAR(hire_date, 'DY dd Month MM/Year') Month_Hired
from employees
where last_name = 'Higgins';


select last_name,TO_CHAR(hire_date, ' DD Month YYYY'),
TO_CHAR(hire_date, 'fmDD Month YYYY')
as HIREDATE
from employees;


select last_name, TO_CHAR(hire_date, 'fmDdspth "of" Month yyyy fmHH12:MI:SS AM')
as HIREDATE
from employees;


select salary, TO_CHAR(salary, '$99,999.00') SALARY
 --TO_CHAR(salary, 'L99,999.00') sal
from employees
where last_name = 'Ernst';


select last_name,
UPPER(CONCAT(SUBSTR(last_name,1,8),'_US'))
as "Last name"
from employees
where department_id = 60;


select to_char(next_day(add_months(hire_date ,6),'friday'), 
 'fmDay,Month ddth,yyyy')
  as "Next 6 Month Review"
     --add_months( next_day(hire_Date,'friday'),6)
from employees;


select last_name, salary, commission_pct,
  NVL(commission_pct,0) NVL_COMMISSION_PCT,
  (salary*12) + (salary*12*nvl(commission_pct,0)) AN_SAL
  from employees;


select last_name, salary, commission_pct,
  NVL2(commission_pct, 'SAL+COM', 'SAL') 
   as INCOME
from employees
where department_id IN (50,80);


select first_name, LENGTH(first_name) "exprl",
last_name, LENGTH(last_name) "expr2",
NULLIF(LENGTH(first_name), LENGTH(last_name)) "result"
from employees;


select last_name, manager_id, commission_pct,
   COALESCE(TO_CHAR(commission_pct), TO_CHAR(manager_id),
    'No commission and No manager') as expression
    from employees;
    
    
select last_name, salary, commission_pct,
COALESCE(salary*commission_pct+salary , salary+2000)
 as "New Salary"
from employees;


select last_name, job_id, salary,
CASE job_id WHEN 'IT_PROG'  THEN 1.10*salary
            WHEN 'ST_CLERK' THEN 1.15*salary
            WHEN 'SA_REP'   THEN 1.20*salary
            ELSE salary
 END AS "REVISED SALARY"
from employees;


select last_name ,salary, 
 case  when salary <5000 then 'Low'
       when salary <10000 then 'Medium'
       when salary <20000 then 'Good'
 end as qualifiied_salary
from employees;


select last_name ,salary,
 case  when salary <6000   then 0.36
       when salary <8000   then 0.38
       when salary <10000  then 0.4
       when salary <12000  then 0.42
       when salary <14000  then 0.44
       when salary <16000  then 0.45
 end as tax_rate
from employees; 


select job_id, job_title, min_salary,
to_char(case  when job_title like 'A%' then min_salary*1.10
      when job_title like 'P%' then min_salary*1.20
      else min_salary
end, '99,999.99' ) as new_min
from jobs;


----------------------------------------------------------------------------------------------------------------------------
--chater 5

select max(salary), min(salary)
from employees;


select  group_function(column), ...
from tables
[where condition]
[order by column];


select round (AVG(salary),2), MAX(salary),
MIN(salary), SUM(salary)
from employees
where job_id like '%REP%';


select  MIN(hire_date), MAX(hire_date)
from employees;


select MIN(last_name) first_lastname , 
       MAX(last_name) first_lastname
from employees;


select count(*)
from employees
where department_id = 50;


select count(commission_pct)
from employees
where department_id = 80;


select count(distinct department_id)
from employees;


select avg(commission_pct)
from employees; --/ 35


select avg(nvl(commission_pct,0))
from employees; --/ 107


select department_id , avg(salary)
from employees
group by department_id;


select to_char(avg(salary),'99,999.99') 
   "Average Salary", round(avg(salary),2)
from employees
group by department_id;


select department_id DEPT_ID, job_id,
sum(salary) 
from employees
group by department_id, job_id
order by department_id;
Display 20 rows


select department_id, count(last_name)
from employees
group by department_id;


select department_id, job_id, count(last_name)
from employees
group by department_id, job_id;


select department_id,avg(salary)
from employees
having Avg(salary) > 8000
group by department_id; --สลับที่ได้
-- ต้องจบด้วย order by


select department_id, max(salary)
from employees
group by department_id
having max(salary) > 10000;


select department_id, avg(salary) "Average Salary"
from employees
group by department_id
having max(salary)> 12000;


select job_id, 
to_char(sum(salary) ,'99,999') payroll
from employees
where job_id like 'S%'
group by job_id 
having sum(salary) > 13000 
--and job_id like 'S%'
order by 1;


select max(avg(salary))
from employees
group by department_id;


--------------------------------------------------------------------------------------------------------------------------------
-- 6

select department_id, department_name,
location_id, city
from departments
natural join locations;


select location_id, street_address, city, state_province, country_name
from locations
natural join countries;


select employee_id, last_name, location_id, department_id
from employees join departments
using (department_id);


select last_name, department_id, department_name
from employees join departments
using (department_id);


select e.employee_id, e.last_name, e.department_id,
d.department_id, d.location_id
from employees e join departments d
on e.department_id = d.department_id;
--สร้างเงือนไขเฉพาะ , ค่าตรงกัน


select  e.last_name,  d.department_id, city, country_name, region_name, job_title
from employees e join departments d
on e.department_id = d.department_id
join locations l
on d.location_id = l.location_id
join countries c
on l.country_id = c.country_id
join regions r
on c.region_id = r.region_id
join jobs j
on e.job_id = j.job_id;


select department_id, department_name, d.location_id, l.city
from departments d join locations l
on d.department_id = l.location_id
where department_id in (20,50);






