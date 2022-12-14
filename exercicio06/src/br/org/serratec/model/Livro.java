package br.org.serratec.model;

public class Livro {
	protected String autor;
	protected String titulo;
	protected Double valor;

	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	
	@Override
	public String toString() {
		return " || Autor: " + autor + " || Titulo: " + titulo;
	}


	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}

	public void calcularReajuste(Double reajuste) {
		valor *= (1 + reajuste / 100) ;
	}
}
