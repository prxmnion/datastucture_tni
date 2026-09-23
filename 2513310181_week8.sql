 --Parphatson Senket 2513310181
--week 8

--1
select first_name || ' ' || substr(last_name, 1,2) || '.' as name,
to_char(salary,'99,999.99')salary
from employees
where salary > ( select avg(salary)
                 from employees );


--2
select employee_id,  first_name || ' ' ||last_name
from employees
where employee_id in ( select manager_id
                      from departments
                      where location_id in ( select location_id
                                             from locations
                                             where country_id = 'UK' ));
                      
                    
--3
select l.location_id, city || ' in ' ||  country_name as info
from locations l join countries c 
on l.country_id = c.country_id
join departments d on l.location_id = d.location_id
where l.state_province is not null
and d.department_name in ('Human Resources', 'Public Relations', 'Sales' );



--4
select employee_id, last_name, job_id, salary
from employees
where manager_id = ( select employee_id
                     from   employees
                     where  first_name = 'Eleni')
and salary < ( select avg(salary)
               from employees );
               
               

--5
select last_name, department_id
from employees
where department_id = ( select department_id
                        from employees
                        where last_name = '&&last_name')
and last_name != '&last_name';

undefine last_name;

                 