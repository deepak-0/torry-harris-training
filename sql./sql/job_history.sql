desc job_history;
insert into job_history(employee_id,start_date,end_date,job_id,department_id)
values(200,20170920,200122,"ad-asst",1233);
select * from job_history;
update job_history set department_id=10;
alter table job_history add primary key (employee_id);
alter table job_history add unique index (start_date,employee_id);
insert into job_history values(101,170909,210909,"ad-asst",11);
update job_history set employee_id =100 where department_id=10;
alter table job_history add foreign key (employee_id) references employees (employee_id);
alter table job_history add foreign key (job_id) references jobs (job_id);
alter table job_history add foreign key (department_id) references department (department_id);