desc department;
insert into department(department_id,department_name,manager_id,location_id)
values (10,"Admin",200,1700);
select * from department;
alter table department add foreign key (location_id) references locations(location_id);
update department set department_id=10 where manager_id=200;
insert into department values (11,"admin1",201,1201); 
alter table department add foreign key(manager_id) references employees(manager_id);