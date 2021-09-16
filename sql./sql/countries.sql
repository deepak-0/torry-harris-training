SELECT * FROM schema1.countries;
insert into countries(country_id,country_name,region_id) values (10101,"India",100);
select * from countries;
insert into countries(country_id,country_name,region_id) values (10102,"USA",101);
alter table countries add foreign key (region_id) references region (region_id);
desc countries;

