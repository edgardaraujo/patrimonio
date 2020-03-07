show databases;

create database patrimonio;

use patrimonio;

drop table patrimonio;

create table patrimonio (
     id int not null primary key auto_increment,
     descricao varchar(80),
     localizacao varchar(80)
);

insert into patrimonio(descricao,localizacao)
    values ('Macbook Air', 'Sala 502 - pr�dio principal');

insert into patrimonio(descricao,localizacao)
    values ('Notebook Dell', 'Sala 301 - pr�dio principal');
    
select * from patrimonio;
