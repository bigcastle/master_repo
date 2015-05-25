# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table card_detail_table (
  thanks_card_id            integer not null,
  thanks_card_help          varchar(255),
  thanks_card_word          varchar(255),
  thanks_card_date          varchar(255),
  thanks_card_receive       integer,
  thanks_card_point         integer,
  thanks_card_totalpoint    integer,
  constraint pk_card_detail_table primary key (thanks_card_id))
;

create table department_table (
  department_id             integer not null,
  department_name           varchar(255),
  boss_id                   integer,
  constraint pk_department_table primary key (department_id))
;

create table stafftable (
  staff_id                  integer not null,
  staff_password            varchar(255),
  staff_name                varchar(255),
  department_id             integer,
  authority_id              integer,
  constraint pk_stafftable primary key (staff_id))
;

create table thanks_card_table (
  staff_id                  integer not null,
  thanks_card_id            integer,
  constraint pk_thanks_card_table primary key (staff_id))
;

create sequence card_detail_table_seq;

create sequence department_table_seq;

create sequence stafftable_seq;

create sequence thanks_card_table_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists card_detail_table;

drop table if exists department_table;

drop table if exists stafftable;

drop table if exists thanks_card_table;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists card_detail_table_seq;

drop sequence if exists department_table_seq;

drop sequence if exists stafftable_seq;

drop sequence if exists thanks_card_table_seq;

