
---views


create view emp80
as select  employee_id, last_name,salary
   from    employees
   where   department_id = 80;

desc emp80;
select * from emp80;

create or replace view emp80
(id_number, name, sal, department_id)
as select employee_id, first_name || ' ' 
|| last_name, salary, department_id
from    employees
where   department_id = 80;


create view empit
as select employee_id, last_name, job_title
   from employees e join jobs j
   on e.job_id = j.job_id
   where e.job_id = 'IT_PROG';
   
   
create or replace view empit (code, "Name", social, "job Name")
as select employee_id,first_name||last_name last_name,
   salary *0.03 ||'BAHT',job_title
   from employees e join jobs j
   on e.job_id = j.job_id
   where e.job_title in('Purchasing Clerk','Stock Clerk');
   
select * from empit;


create view dept_view ("Dep No","Dep Name","Emp Name")
as select d.department_id, d.department_name, e.first_name
   from departments d join employees e
   on d.department_id = e.department_id
   where d.department_id = 100;


create or replace view dept_sum_vu
(name, minsal, maxsal, avgsal)
as select   department_name, min(salary), max(salary),avg(salary)
   from     employees e,departments d
   where   e.department_id = d.department_id
   group by department_name;
-- , แทนคำว่า on

select * from dept_view;


create or replace view job_view ("job name", "avg sal", "total sal")
as select job_title, to_char(avg(salary),'99,999.99'), 
   to_char(sum(salary),'9999,999.99')
   from jobs j join employees e
   on j.job_id = e.job_id
   group by job_title
   having sum(salary) > 10000
   and substr(job_title,1,1) in ('P','S')
  -- and job_title like 'P%''
  --or job_title like  'S%'
   order by 1;
   
select * from job_view;


drop view dept_sum_vu;
drop view emp80;
drop view dept_view;
drop view empit;
drop view job_view;

--------------------------------------------------------------------------------------------

--sequences

create sequence dept_deptid_seq
                increment by 50
                start with 1000
                maxvalue 3000
                nocache
                nocycle;
                

insert into departments(department_id, 
            department_name, location_id)
values     (dept_deptid_seq.nextval, 
            'Support', 2500);
            

insert into departments(department_id, 
            department_name, location_id)
values     (dept_deptid_seq.nextval, 
            'HR', 1400);

select dept_deptid_seq.currval from dual;


alter sequence dept_deptid_seq
                increment by 20
                maxvalue 999999
                nocache
                nocycle;
                
insert into departments(department_id, 
            department_name, location_id)
values     (dept_deptid_seq.nextval, 
            'Engineer', 1800);           
            
drop sequence dept_deptid_seq;

delete  from departments
where department_id >=300;