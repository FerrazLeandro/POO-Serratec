package br.org.serratec.enuns;

public enum Sanduiche {
	HAMBURGUER("X-Monstrão", 20.), MISTO("Misto quente", 8.), HOTDOG("Cachorro Quente", 12.);

	private String tipo;
	private Double valor;

	private Sanduiche(String tipo, Double valor) {
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
