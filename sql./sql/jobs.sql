SELECT * FROM schema1.jobs;
desc jobs;
insert into jobs (job_id,job_title,min_salary,max_salary)
values ("AD-VP","Admin Vice president",15000,30000);
select * from jobs;
update jobs set job_id="ad-asst";
insert into jobs values("ad-asst1","Admin Vice president",18000,35000);