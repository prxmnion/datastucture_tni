--2513310181 Praphatson Senket

--1

select employee_id, start_date, end_date,
 add_Months(end_date, 2) as "2 month after end date",
 next_day(end_date, 'Month') as "Next monday",
 Last_day(end_date) as "Last day",
 months_between(end_date, start_date) as "Month work"
from job_history
where Months_between(end_date, start_date)> 40;
 
 --2
 
select last_name, LENGTH(last_name) as "LENGTH" 
from employees
where substr(last_name, 1, 1) = 'G'
  and last_name not like '%K'
  and last_name not like '%e';

--3

select job_id, job_title, max_salary,
 (max_salary * 1.07)
 as"Max salary with bonus"
from jobs;

--4

select substr(job_id, 1,5) || '.' || job_title as new_name
from jobs;