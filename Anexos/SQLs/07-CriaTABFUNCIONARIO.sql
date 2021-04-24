create table tabfuncionario(
	id serial primary key not null,
    id_pessoa int not null,
    id_cargo int not null,
    id_login int not null,
    data_admissao date,
    data_demissao date,
    descricao varchar(300),
	constraint fk_pessoa_funcionario foreign key (id_pessoa) references tabpessoa(id),
    constraint fk_cargo_funcionario foreign key (id_cargo) references tabcargo(id),
    constraint fk_login_funcionario foreign key (id_login) references tablogin(id)
);