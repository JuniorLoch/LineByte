create table tabvenda(
	id serial primary key not null,
	id_funcionario int,
	id_cliente int,
	valor_venda decimal(10,2),
	data_venda date,
	nota_fiscal varchar(70),
    constraint fk_funcionario_venda foreign key (id_funcionario) references tabfuncionario(id),
    constraint fk_pessoa_venda foreign key (id_cliente) references tabcliente(id)
);