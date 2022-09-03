package br.org.serratec.model;

public interface Livraria {
	Double taxaEmprestimo = 2.8;
	
	void venderLivro(Livro livro);
	void emprestarLivro(Livro livro);
}
