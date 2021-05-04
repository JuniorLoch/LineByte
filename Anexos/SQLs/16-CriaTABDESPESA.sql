create table tabdespesas(
	id serial primary key not null,
	id_categoria int,
	data_vencimento date,
	pago char,
	nome varchar(200),
	valor float,
	constraint fk_tipoDespesa_despsa foreign key (id_categoria) references tabtipo_despesa(id)
);