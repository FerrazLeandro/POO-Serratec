package br.org.serratec.model;

public class Produto {

	private Integer codigo;
	private String descricao;
	private Double valor;
	
	// Pertence a classe
		private static int total;
	
	public Produto(Integer codigo, String descricao, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		total++;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public static int getTotal() {
		return total;
	}
	
	
	
}
