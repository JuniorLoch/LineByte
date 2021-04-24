create database LineByte;

create table endereco (
	id serial primary key not null,
	cidade varchar(40),
	estado varchar(40),
	bairro varchar(40),
	rua varchar(40),
	numero varchar(5),
	cep varchar(10),
	complemento varchar(10)
);

create table pessoa(
	id serial primary key not null,
	id_endereco int,
	cpf varchar(15),
	rg varchar(15),
	data_nasc date,
	sexo char,
	constraint fk_pessoa_endereco foreign key (id_endereco) references endereco(id)
);