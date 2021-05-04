create table tabestoque(
	id serial primary key not null,
	id_produto int,
	qtd_estoque  int,
	constraint fk_produto_estoque foreign key (id_produto) references tabproduto(id)
);