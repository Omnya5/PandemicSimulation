create table day_of_simulation (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table simulation (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table day_of_simulation add constraint FKdert9ttnxjxk8dqc5umnyu61x foreign key (simulation_id) references simulation (id)
create table day_of_simulation (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table simulation (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table day_of_simulation add constraint FKdert9ttnxjxk8dqc5umnyu61x foreign key (simulation_id) references simulation (id)
create table day_of_simulation (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table simulation (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table day_of_simulation add constraint FKdert9ttnxjxk8dqc5umnyu61x foreign key (simulation_id) references simulation (id)
create table day_of_simulation (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table simulation (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table day_of_simulation add constraint FKdert9ttnxjxk8dqc5umnyu61x foreign key (simulation_id) references simulation (id)
create table day_of_simulation (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table simulation (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table day_of_simulation add constraint FKdert9ttnxjxk8dqc5umnyu61x foreign key (simulation_id) references simulation (id)
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table pandemic_day (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint not null, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulation (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulation add constraint UK_jushj5kd5dxqdxgshofoonqtm unique (name)
alter table pandemic_day add constraint FKlsb260y6sp6b7e8ruk9r0w5qh foreign key (simulation_id) references simulation (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table pandemic_day (id bigint not null auto_increment, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null auto_increment, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table pandemic_day (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
create table hibernate_sequence (next_val bigint) engine=MyISAM
insert into hibernate_sequence values ( 1 )
create table pandemic_day (id bigint not null, infected bigint, dead bigint, recovered bigint, healthy bigint, simulation_id bigint, primary key (id)) engine=MyISAM
create table simulations (id bigint not null, infected bigint not null, mortality_rate float not null, name varchar(255) not null, population bigint not null, rate float not null, infection_time integer not null, mortality_time integer not null, simulation_time integer not null, primary key (id)) engine=MyISAM
alter table simulations add constraint UK_22d2rd060t0ifmnt9jhbwwta3 unique (name)
alter table pandemic_day add constraint FKdj9pqybgjdfl359041r2wnlmj foreign key (simulation_id) references simulations (id)
