create table tabcliente(
	id serial primary key not null,
    id_pessoa int not null,
    constraint fk_pessoa_cliente foreign key (id_pessoa) references tabpessoa(id)
);