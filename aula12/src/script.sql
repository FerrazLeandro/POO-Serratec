CREATE DATABASE aula12;

CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar(50),
telefone varchar(11), email varchar(40) unique);

INSERT INTO cliente (nome, telefone, email) 
					 VALUES ('Leandro', '12345678901', 'l@test.com'),
					        ('Kamylla', '11111111111', 'k@test.com'),
					        ('Giovanna','12222222222', 'g@test.com'),
					        ('Sidineia', '3333333333', 's@test.com'),
					        ('Erocedes', '4444444444', 'e@test.com');