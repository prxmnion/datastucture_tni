--2513310181 Praphatson SenKet

--1
select departmant_id, department_name || ' ' || location_id as info
from departments
where department_id = 50;
--2
select job_id, job_title, min_salary
from jobs
where job_id = 'AD_PRES'
order by min_salary;
--3
select country_name
from countries
where substr(country_name,3,1) = 'i';
--4
select first_name||' '|| last_name as EMP_name, salary, commission_pct
from employees
where  first_name   like '%e%' and last_name like '%e%'
and commission_pct between 0.2 and 0.4
order by EMP_name;
--5
select location_id , street_address|| ' ' ||  city || ' ' || state_province|| ' ' ||country_id as aaddess
from locations
where state_province is not null;
