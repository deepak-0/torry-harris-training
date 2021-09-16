insert into locations( location_id,street_address,postal_code,city,state_province,country_id) 
values  (1200,"2017 shinjuku-ku","1689","tokyo","tokyo prefecture","JP");
desc locations;
select * from locations;
update locations set country_id="10101";
insert into locations values (1201,"334-third street","6001","rio","Swiss","10102");
alter table locations add foreign key(country_id) references countries(country_id);
alter table locations modify column country_id char(10);
