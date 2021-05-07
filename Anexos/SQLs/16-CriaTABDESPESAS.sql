create table tabdespesas(
	id serial primary key not null,
	id_tipo_despesa int,
	data_vencimento date,
	pago char,
	nome varchar(200),
	valor float,
	constraint fk_tipoDespesa_despsa foreign key (id_tipo_despesa) references tabtipo_despesa(id)
);