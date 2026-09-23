---Praphatson Senket 2513310181
---week 11

---1
create or replace view dep_loc_country 
as select d.department_id, d.department_name, l.state_province, c.country_name
   from departments d join locations l 
   on d.location_id = l.location_id
   join countries c on l.country_id = c.country_id
   where d.manager_id is not null;
   
select * from dep_loc_country;

---2
create or replace view job2 ("employee_id","last_name","job_title","salary","average")
as select e.employee_id, e.last_name, job_title,
   to_char(e.salary,'$99,999.99'),
   to_char((j.min_salary + j.max_salary)/ 2,'$99,999.99') 
   as average
   from employees e join jobs j
   on e.job_id = j.job_id
   where e.salary <(j.min_salary + j.max_salary) / 2;
   
select * from job2;

---3
create sequence car_id_seq
                increment by 50
                start with 1000
                maxvalue 3000
                nocache
                nocycle;

---4
create table car(car_id number,car_name varchar2(100));

insert into car(car_id, car_name)
values     (car_id_seq.nextval, 
            'Porscha Cayenne Turbo GT');


insert into car(car_id, car_name)
values     (car_id_seq.nextval, 
            'McLARREN 750S');
            

insert into car(car_id, car_name)
values     (car_id_seq.nextval, 
            'BMW M1');
 
 SELECT * FROM  car;
 
 
---5
create or replace view Dcount ("DEPARTMENT_ID" , "Number of department")
as select department_id, count(*)
          from employees
          where department_id is not null
          group by department_id
          order by department_id;
          
select * from Dcount;


drop view dep_loc_country;
drop view job2; 
drop sequence car_id_seq;