					 
CREATE TABLE categoria(codigo_categoria serial PRIMARY KEY, 
					   nome VARCHAR(40));					 

CREATE TABLE produto(codigo serial PRIMARY KEY, 
					 descricao VARCHAR(40) NOT NULL, 
					 preco numeric CHECK (preco > 0) NOT NULL,
					 quantidade_estoque SMALLINT DEFAULT 0,
					 codigo_categoria int,
					 FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo_categoria));