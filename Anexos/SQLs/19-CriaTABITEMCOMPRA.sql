create table tabitemcompra(
	id serial primary key not null,
	id_produto int,
	id_compra int,
	valor float,
	quantidade int,
    constraint fk_produto_itemcompra foreign key (id_produto) references tabproduto(id),
    constraint fk_compra_itemcompra foreign key (id_compra) references tabcompra(id)
);