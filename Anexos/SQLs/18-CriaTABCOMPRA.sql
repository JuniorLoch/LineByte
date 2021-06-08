create table tabcompra(
	id serial primary key not null,
    id_fornecedor int,
	valor_compra decimal(10,2),
	data_compra date,
	nota_fiscal varchar(70),
    constraint fk_fornecedor_comra foreign key (id_fornecedor) references tabfornecedor(id)
);