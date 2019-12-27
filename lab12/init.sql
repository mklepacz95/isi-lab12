create database isi;

create table isi.zad1 (id int(20) not null  auto_increment primary key
	, adres_ip varchar(20) not null
    , kod_kraju varchar(10) not null );
 
create user isi@localhost IDENTIFIED BY 'isi_user';

grant all privileges on isi.* to isi@localhost;

create table isi.zad2 (
	id int(20) auto_increment not null primary key
    , kod_kraju varchar(10) not null
    , kurs_waluty varchar(255) 
    , data_zmainy date
);
insert into isi.zad2 (kod_kraju) values ('PL');
insert into isi.zad2 (kod_kraju) values ('DE');
insert into isi.zad2 (kod_kraju) values ('US');

create table isi.zad3 (
	id int(20) not null auto_increment primary key,
    adres_ip varchar(15) not null
);

insert into isi.zad3(adres_ip) values ('141.20.103.210');
