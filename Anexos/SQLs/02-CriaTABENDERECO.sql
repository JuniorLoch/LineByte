create table tabendereco (
	id serial primary key not null,
	cidade varchar(40),
	estado varchar(40),
	bairro varchar(40),
	rua varchar(40),
	numero varchar(5),
	cep varchar(10),
	complemento varchar(1000)
);