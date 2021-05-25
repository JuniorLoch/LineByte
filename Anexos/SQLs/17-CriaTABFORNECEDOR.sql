create table tabfornecedor(
	id serial primary key not null,
	id_endereco int,
	cnpj varchar(18),
	nome varchar(200),
	constraint fk_fornecedor_endereco foreign key (id_endereco) references tabendereco(id)
);