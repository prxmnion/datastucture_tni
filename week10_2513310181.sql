--Praphatson Senket 2513310181
--week 10

---1
create table vendor 
(  v_id number(5) primary key,
   first_name varchar2(30) not null,
   last_name varchar2(30) not null,
   update_date date default sysdate,
   email varchar2(50)
   );
   
select * from vendor;


create table item 
(  ite_id number(4) primary key,
   ite_name varchar2(30) not null,
   price number(7,2) not null,
   price_vat number(7,2)
   );
   
select * from item;



create table log_history
(  ite_id number(4),
   v_id number(5),
   transac varchar2(3) check (transac in ('IN','OUT')),
   primary key (ite_id, v_id),
   foreign key (ite_id) references item(ite_id),
   foreign key (v_id) references vendor(v_id)
   );
   
select * from log_history;

---2
--2.1

insert into vendor (v_id, first_name, last_name)
values (&v_id, '&first_name', '&last_name');
/*
10001	tom	hot	09 SEP 26	
10002	mix	key	09 SEP 26	
10003	bai	mon	09 SEP 26	
10004	mind mint	09 SEP 26	
10005	ta	bean	09 SEP 26	*/


--2.2

insert into item (ite_id, ite_name, price)
values (&ite_id, '&ite_name', &price);
/*2001	water	10	
2002	candy	2	
2003	milk	14	
2004	icecream	45	
2005	bread	69	*/


--2.3

insert into log_history (ite_id, v_id, transac)
values (&ite_id, &v_id, '&transac');
/*2001	10001	IN
2002	10002	OUT
2003	10003	IN
2004	10004	OUT
2005	10005	IN */

---3

update item
set price_vat = price *1.07;
/*2001	water	10	10.7
2002	candy	2	2.14
2003	milk	14	14.98
2004	icecream	45	48.15
2005	bread	69	73.83 */
---4

update vendor
set email = initcap(substr(last_name,1,2)) ||'.'|| initcap(first_name) || '@vend.ac.th';
/*10001	tom	hot	09 SEP 26	Ho.Tom@vend.ac.th
10002	mix	key	09 SEP 26	Ke.Mix@vend.ac.th
10003	bai	mon	09 SEP 26	Mo.Bai@vend.ac.th
10004	mind	mint	09 SEP 26	Mi.Mind@vend.ac.th
10005	ta	bean	09 SEP 26	Be.Ta@vend.ac.th*/

---5

create table contract_vendor as
select i.ite_name,
       v.email,
       l.transac,
       case 
           when l.transac = 'IN' then sysdate - 100
           else sysdate
       end as date_transac
from log_history l
join vendor v on l.v_id = v.v_id
join item i on l.ite_id = i.ite_id;

select * from contract_vendor;
/*water	Ho.Tom@vend.ac.th	IN	01 JUN 26
candy	Ke.Mix@vend.ac.th	OUT	09 SEP 26
milk	Mo.Bai@vend.ac.th	IN	01 JUN 26
icecream	Mi.Mind@vend.ac.th	OUT	09 SEP 26
bread	Be.Ta@vend.ac.th	IN	01 JUN 26 */
