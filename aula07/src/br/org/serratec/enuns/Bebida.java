package br.org.serratec.enuns;

public enum Bebida {
	REFRIGERANTE("Coca-Cola", 6.), AGUA("Água mineral", 2.), SUCO("Dell Vale", 4.), CERVEJA("Brahma", 5.);

	private String tipo;
	private Double valor;

	private Bebida(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return " " + tipo + " Valor: " + valor;
	}

}
