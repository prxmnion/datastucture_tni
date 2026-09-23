-- 2513310181 Praphatson senket

-- week 5
--1
select  job_title, 'min salary'
||to_char(min_salary, '99,999.99' ) as "Min",
'Min salary with bonus' || to_char(trunc(min_salary*1.07), '99,999.99') "Min with bonus" 
from jobs;


--2
select employee_id, first_name, last_name,
to_char(add_months(next_day(hire_date, 'FRIDAY'), 6), 'Ddth Mon YYYY') 
as "Performance TestDate"
from employees;


--3
select department_id, department_name,
case location_id
                  when 1700 then 'Temporary shutdown'
                  when 1800 then 'Schedule for maintenace'
                  when 2400 then 'Offline for maintenance'
                 else 'Online'
end  as "Status"
from departments;


--4
select country_id,  
count(*) as "Location in Country"
from locations
where location_id is not null
and street_address is not null
and postal_code is not null
and city is not null
and state_province is not null
group by country_id;


--week 6


--1
select e.employee_id, h.start_date, h.end_date, h.job_id
from employees e
join job_history h on e.employee_id = h.employee_id
where h.department_id in (50,80);


--2
select location_id, street_address, country_id, postal_code
from locations
where postal_code is null
and substr(street_address,1,1) between '0' and '9';


--3
select l.location_id, l.street_address, l.city, c.country_name, r.region_name
from locations l
join countries c on l.country_id = c.country_id
join regions r on c.region_id = r.region_id
where r.region_id = 1;


--4
select 
    jh.employee_id, 
    e.first_name || ' ' || SUBSTR(e.last_name, 1, 2) AS "NAME",
    j.job_title,
    jh.start_date,
    jh.end_date
from job_history jh
join employees e ON jh.employee_id = e.employee_id
join jobs j ON jh.job_id = j.job_id
where jh.department_id IN (110, 80, 50);
    
--5
select
    jh.employee_id,
    j.job_title,
    TO_CHAR(jh.start_date, 'Dy DDth MON YYYY') AS "START_DATE"
from job_history jh
join jobs j on jh.job_id = j.job_id
where upper(TO_CHAR(jh.start_date, 'MON')) = UPPER('&month');




