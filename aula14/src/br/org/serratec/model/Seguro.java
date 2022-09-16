package br.org.serratec.model;

public class Seguro {
	private String cobertura;
	private Double valorSeguro;

	public Seguro(String cobertura, Double valorSeguro) {
		super();
		this.cobertura = cobertura;
		this.valorSeguro = valorSeguro;
	}

	@Override
	public String toString() {
		return "Seguro [cobertura=" + cobertura + ", valorSeguro=" + valorSeguro + "]";
	}

	public String getCobertura() {
		return cobertura;
	}

	public Double getValorSeguro() {
		return valorSeguro;
	}

}
