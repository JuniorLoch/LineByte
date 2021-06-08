create table tabpessoa(
	id serial primary key not null,
	id_endereco int,
	nome varchar(200),
	cpf varchar(15),
	rg varchar(15),
	data_nasc date,
	sexo char,
	constraint fk_pessoa_endereco foreign key (id_endereco) references tabendereco(id)
);