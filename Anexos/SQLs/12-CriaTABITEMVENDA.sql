create table tabitemvenda(
	id serial primary key not null,
	id_produto int,
	id_venda int,
	valor float,
	quantidade int,
    constraint fk_produto_itemvenda foreign key (id_produto) references tabproduto(id),
    constraint fk_venda_itemvenda foreign key (id_venda) references tabvenda(id)
);