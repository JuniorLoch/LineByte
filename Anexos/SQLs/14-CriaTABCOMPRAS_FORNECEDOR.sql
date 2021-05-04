create table tabcompras_fornecedor(
	id serial primary key not null,
	id_produto int,
	nome_fornecedor varchar (200),
	valor_pago float,
	data_compra date,
	constraint fk_produto_compraFornecedor foreign key (id_produto) references tabproduto(id)
);