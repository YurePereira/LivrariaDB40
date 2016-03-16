
create database livraria;

use livraria;

create table livro (

id_livro int not null,
nm_livro varchar(100),
ds_livro text,
dt_lancamento date,
cd_isbn varchar(20),
dt_registrado date,
dt_alterado date,
fl_status tinyint,
primary key (id_livro)

);

select * from livro;