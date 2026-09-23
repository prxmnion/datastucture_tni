---week 12
--Praphatson Senket 2513310181

---1
declare
   v_dept_id   departments.department_id%type := 50;
   v_dept_name departments.department_name%type;
   v_avg_sal   number(10, 2);
begin
   select d.department_name, avg(e.salary)
   into v_dept_name, v_avg_sal
   from departments d
   join employees e on d.department_id = e.department_id
   where d.department_id = v_dept_id
   group by d.department_name;

   dbms_output.put_line('Department ID: ' || v_dept_id);
   dbms_output.put_line('Department Name: ' || v_dept_name);
   dbms_output.put_line('Average salary in this department is ' || to_char(v_avg_sal, '99,999.99') || ' Baht.');

end;
/

create or replace procedure get_dept_avg_sal(p_dept_id number) is
   v_dept_name departments.department_name%type;
   v_avg_sal   number(10, 2);
begin
   select d.department_name, avg(e.salary)
   into v_dept_name, v_avg_sal
   from departments d
   join employees e on d.department_id = e.department_id
   where d.department_id = p_dept_id
   group by d.department_name;

   dbms_output.put_line('Department ID: ' || p_dept_id);
   dbms_output.put_line('Department Name: ' || v_dept_name);
   dbms_output.put_line('Average salary in this department is ' || to_char(v_avg_sal, '99,999.99') || ' Baht.');
exception
   when no_date_found then
     dbms_output.put_line('Department ID ' || p_dept_id || ' not found or has no employees.');

end;
/
exec get_dept_avg_sal(50);
/


---2
declare
   v_id   number := &employee_id;
   v_fname employees.first_name%type;
   v_lname employees.last_name%type;
   v_sal   employees.salary%type;
   v_comm  employees.commission_pct%type;
begin
   select first_name, last_name, salary,nvl(commission_pct, 0)
   into v_fname, v_lname, v_sal, v_comm
   from employees 
   where employee_id = v_id;

    dbms_output.put_line('Employee ID: ' || v_id);
    dbms_output.put_line('Name: ' || v_fname || ' ' || v_lname);
    dbms_output.put_line('New salary: ' || to_char((v_sal + (v_sal * v_comm)) * 1.20, '99,999.99') || ' Baht.');

end;
/

create or replace procedure  calc_new_salary(p_emp_id number) is
   v_fname employees.first_name%type;
   v_lname employees.last_name%type;
   v_sal   employees.salary%type;
   v_comm  employees.commission_pct%type;
begin
   select first_name, last_name, salary, nvl(commission_pct, 0)
   into v_fname, v_lname, v_sal, v_comm
   from employees 
   where employee_id = p_emp_id;

   dbms_output.put_line('Employee ID: ' || p_emp_id);
   dbms_output.put_line('Name: ' || v_fname || ' ' || v_lname);
   dbms_output.put_line('New salary: ' || to_char((v_sal + (v_sal * v_comm)) * 1.20, '99,999.99') || ' Baht.');

end;
/

exec calc_new_salary(145);
/


---3
declare
   Name varchar2(20) := 'Supra Toyota';
   qty   number := 9;
   price constant number := 3900;
   total number;
begin
   total := (qty * price) * 1.07; 

    dbms_output.put_line('Product : ' || Name);
    dbms_output.put_line('Quantity : ' || qty);
    dbms_output.put_line('Price : ' || price);
    dbms_output.put_line('Total (+vat 7%) : ' || to_char(total, '99,999.99') || ' Baht');

end;
/

create or replace procedure calc_product is
   Name varchar2(20) := 'Supra Toyota';
   qty   number := 9;
   price constant number := 3900;
   total number;
begin
   total := (qty * price) * 1.07;

   dbms_output.put_line('Product : ' || Name);
   dbms_output.put_line('Quantity : ' || qty);
   dbms_output.put_line('Price : ' || price);
   dbms_output.put_line('Total (+vat 7%) : ' || to_char(total, '99,999.99') || ' Baht');
end;
/

exec calc_product;
/





















