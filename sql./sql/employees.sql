desc employees;
insert into employees (employee_id,fist_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
values(100,"dhoni","MS","123@mail.com","+91123456789",str_to_date('06-03-2017', '%m-%d-%Y'),
"ad-pres",24000,null,null,90);
select * from employees;
update employees set manager_id=200;
update employees set job_id="ad-asst1" where employee_id=101;
insert into employees 
values (101,"raina","SR","234@yahoo.com",+4412345678,"170606","ac-head",25000,null,201,91);
alter table employees add foreign key (job_id) references jobs (job_id);
alter table employees add foreign key (department_id) references department (department_id);
update employees set department_id=11 where employee_id=101;
alter table employees add foreign key (manager_id) references department (manager_id);