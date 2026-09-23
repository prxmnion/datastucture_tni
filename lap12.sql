--Chapther 8

create table customer 
(  cust_no number(5) primary key,
   name char(20) not null,
   address varchar(40) not null,
   dob date,
   id_char_no number(13) unique,
   cust_type char(1) check(cust_type in ('A','B','C'))
);


create table order1
(  ord_no number(5) primary key,
   ord_date date default sysdate not null,
   amount number(9,2) not null,
   cust_no number(5) references customer(cust_no) 
);


create table suppliers
(  sup_id number(4) primary key,
   sup_name varchar(25) not null,
   address varchar(40) not null 
);
  

create table customers
(  cus_id number(3) primary key,
   cus_name varchar(20) not null,
   age number(2)
);
-- สร้าง primary key ได้ แต่ไม่มีข้อมูล


desc customers;
-- เช็คว่าสร้างตารางยัง

select * from customers;
-- เช็คว่ามีข้อมูลยัง


alter table customers
add (address varchar(50),
    salary number(10,2));


alter table customers
rename column cus_id to id;
--to เปลียนชื่อ 


alter table customers
rename column cus_name to name;


alter table customers rename to contacts;


create table dept80
 as select  employee_id, last_name, 
 salary,hire_date
from   employees
where   department_id = 80;


desc dept80;
select *from dept80;
-- ไม่มี not null ไม่มีคุณสมบัติการเป็น primary key


alter table dept80
add (fname char(30));


alter table dept80
modify(last_name char(30));


alter table dept80
drop column fname;


create table sales_reps (id, name, salary, commission)
 as select employee_id as id , first_name,
 salary, commission_pct 
from employees
where job_id = 'SA_REP';
--สร้างได้ข้อมูล ไม่ได้ primary key


desc sales_reps;
select * from sales_reps;


alter table sales_reps
add constraint emp_id_pk primary key(id);


drop table contacts;
drop table order1;
drop table customer;
drop table dept80;
drop table sales_reps;
drop table suppliers;


----------------------------------------------------------------------------------------------

create table dept
(  dep_id number(4),
   dep_name varchar(20)
);


insert into dept
select department_id, department_name
from departments;

select * from dept;

drop table dept;















