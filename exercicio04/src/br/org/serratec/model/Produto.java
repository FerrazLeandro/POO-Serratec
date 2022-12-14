package br.org.serratec.model;

public class Produto {
	private String descricao;
	private double valor, total;
	private int quantidade;

	public Produto(String descricao, double valor, int quantidade) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return valor * quantidade;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double calcularIcms() {
		double icms = getTotal() * 0.12;
		return icms;

	}

}
