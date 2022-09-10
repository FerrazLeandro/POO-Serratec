package br.org.serratec.model;

import br.org.serratec.enuns.Categoria;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	private Categoria categoria;

	public Produto(Integer codigo, String descricao, Double valor, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
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

	public Categoria getCategoria() {
		return categoria;
	}

}
