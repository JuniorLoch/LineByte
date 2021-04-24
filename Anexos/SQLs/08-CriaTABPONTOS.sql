create table tabpontos(
	id serial primary key not null,
    id_funcionario int not null,
    hora_entrada time,
    hora_saida time,
    data_ponto date,
    constraint fk_funcionario_pontos foreign key (id_funcionario) references tabfuncionario(id)
);