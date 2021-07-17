create table categoria (
	id_categoria int not null auto_increment,
	descricao varchar(100) null,
	primary key (id_categoria)
);

create table produto (
	id_produto int not null auto_increment,
	descricao varchar(255) null,
	preco double null,
	id_categoria int not null,
	primary key (id_produto),
	
	foreign key (id_categoria)
		references categoria(id_categoria)
);
