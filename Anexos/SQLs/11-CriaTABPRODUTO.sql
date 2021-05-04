create table tabproduto(
	id serial primary key not null,
	nome varchar (200),
	tamanho varchar(10),
	marca varchar(100),
	valor float,
	cor varchar(100),
	sexo char
);