package br.org.serratec.model;

import java.time.LocalDate;

public class Venda {
	private Produto produto;
	private LocalDate dataCompra;
	private Integer quantidade;
	private static Double totalVenda;

	public Venda(Produto produto, LocalDate dataCompra, Integer quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return produto.getDescricao() + " - " + totalVenda + "\n";
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getTotalVenda() {
		return totalVenda;
	}

	public static Double calcularVenda(Produto produto) {
		return totalVenda = produto.getValor();
		
	}

	public void mostrarVenda() {

	}

}
