create table tabcliente(
	id serial primary key not null,
    id_pessoa int not null,
    senha varchar(10),
    constraint fk_pessoa_cliente foreign key (id_pessoa) references tabpessoa(id)
);