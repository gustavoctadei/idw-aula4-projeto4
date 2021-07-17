create table categoria (
	id_categoria int not null auto_increment,
	descricao varchar(100) null,
	primary key (id_categoria)
);

create table produto (
	id_produto int not null auto_increment,
	descricao varchar(255) null,
	preco double null,
	primary key (id_produto)
);

create table produto_categoria (
	id_produto_categoria int not null auto_increment,
	id_produto int not null,
	id_categoria int not null,
	primary key (id_produto_categoria),
	
	foreign key (id_produto)
		references produto(id_produto),
		
	foreign key (id_categoria)
		references categoria(id_categoria)
);
