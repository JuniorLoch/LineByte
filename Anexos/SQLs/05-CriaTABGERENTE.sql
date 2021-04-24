create table tabgerente(
	id serial primary key not null,
	id_login int,
    id_pessoa int,
	constraint fk_login_gerente foreign key (id_login) references tablogin(id),
    constraint fk_pessoa_gerente foreign key (id_pessoa) references tabpessoa(id)
);