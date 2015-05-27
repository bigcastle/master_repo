# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table card_detail_table (
  id                        integer not null,
  send_id                   integer,
  receive_id                integer,
  thanks_card_help          varchar(255),
  thanks_card_word          varchar(255),
  thanks_card_date          varchar(255),
  thanks_card_point         integer,
  thanks_card_totalpoint    integer,
  constraint pk_card_detail_table primary key (id))
;

create table department_table (
  id                        integer not null,
  department_name           varchar(255),
  boss_id                   integer,
  constraint pk_department_table primary key (id))
;

create table stafftable (
  id                        integer not null,
  staff_password            varchar(255),
  staff_name                varchar(255),
  department_id             integer,
  authority_id              integer,
  constraint pk_stafftable primary key (id))
;

create sequence card_detail_table_seq;

create sequence department_table_seq;

create sequence stafftable_seq;

alter table card_detail_table add constraint fk_card_detail_table_send_1 foreign key (send_id) references stafftable (id) on delete restrict on update restrict;
create index ix_card_detail_table_send_1 on card_detail_table (send_id);
alter table card_detail_table add constraint fk_card_detail_table_receive_2 foreign key (receive_id) references stafftable (id) on delete restrict on update restrict;
create index ix_card_detail_table_receive_2 on card_detail_table (receive_id);
alter table stafftable add constraint fk_stafftable_DEPARTMENT_3 foreign key (department_id) references department_table (id) on delete restrict on update restrict;
create index ix_stafftable_DEPARTMENT_3 on stafftable (department_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists card_detail_table;

drop table if exists department_table;

drop table if exists stafftable;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists card_detail_table_seq;

drop sequence if exists department_table_seq;

drop sequence if exists stafftable_seq;

