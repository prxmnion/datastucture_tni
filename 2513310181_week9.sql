-- Praphatson Senket 2513310181
--Week 9 

--1
create table dept2
(   d_id number(4),
    d_name varchar(40),
    street_address varchar(40),
    c_id char(2)
);

--2
insert into dept2 (d_id, d_name, street_address, c_id)
select d.department_id, d.department_name, l.street_address, l.country_id
from departments d 
join locations l on d.location_id = l.location_id
where d.department_id is not null
order by d.department_id;

select * from dept2;

--3
create table country2
(   c_id char(2),
    c_name varchar(40),
    r_name varchar(25));
    
    
--4
insert into country2 (c_id, c_name, r_name)
select c.country_id, c.country_name, r.region_name
from countries c 
join regions r on c.region_id = r.region_id
where c.country_id is not null
order by c.country_id;

select * from country2;

--5
alter table dept2
modify (d_name varchar2(45));


--6
alter table dept2
add constraint dept2_d_id_pk primary key (d_id);

--7
alter table country2
add constraint country2_c_id_pk primary key (c_id);

--8
alter table dept2
add constraint dept2_c_id_fk foreign key (c_id)  references country2 (c_id);
 
 -- 9
drop table dept2;
drop table country2;
