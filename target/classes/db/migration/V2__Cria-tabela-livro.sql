CREATE TABLE livro (
	id serial PRIMARY KEY,
	titulo varchar(100),
	isbn varchar(12),
	número_de_páginas varchar(100),
	resumo varchar(100),
	sumario varchar(100),
	data_da_publicacao varchar(100),
	autor_id integer,
	CONSTRAINT fk_livro_autor FOREIGN KEY(autor_id) REFERENCES autor(id)
);