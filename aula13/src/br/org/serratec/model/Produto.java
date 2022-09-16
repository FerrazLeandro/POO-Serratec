package br.org.serratec.model;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double preco;
	private Integer quantidadeEstoque;
	private Categoria categoria;

	public Produto(Integer codigo, String descricao, Double preco, Integer quantidadeEstoque, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", quantidadeEstoque="
				+ quantidadeEstoque + ", categoria=" + categoria + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
