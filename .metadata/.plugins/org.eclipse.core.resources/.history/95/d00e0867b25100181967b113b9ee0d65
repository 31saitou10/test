set names utf8;
set foreign_key_checks = 0;
drop database if exists miami;
create database miami;
use miami;

drop table if exists user_info;

create table user_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null unique,
	password varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	sex tinyint default 0,
	email varchar (32) not null,
	status tinyint default 0,
	login_flg tinyint default 0,
	m_flg tinyint default 0,
	insert_date datetime not null,
	update_date datetime,
	secret_question int not null,
    secret_answer varchar(32) not null
);
