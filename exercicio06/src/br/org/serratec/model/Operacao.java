package br.org.serratec.model;

public class Operacao implements Livraria {
	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}
	
	

	@Override
	public String toString() {
		return "Tipo: " + tipo + " || Valor: " + String.format("%.2f", valorOperacao) + livro.toString();
	}



	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}



	@Override
	public void emprestarLivro(Livro livro) {
		valorOperacao = livro.valor * 0.02 + taxaEmprestimo; 
		
	}



	@Override
	public void venderLivro(Livro livro) {
		valorOperacao = livro.valor * 1.09;
		
	}
	

}
