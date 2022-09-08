package br.org.serratec.model;

public class Pessoa implements Tributacao {
	private String nome;
	private Double rendimentos;
	
	

	public Pessoa(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	

	@Override
	public String toString() {
		return "Nome: " + nome + ", Rendimentos: " + rendimentos;
	}



	public String getNome() {
		return nome;
	}



	public Double getRendimentos() {
		return rendimentos;
	}



	@Override
	public Double calcularImpostoDeRenda() {
		return rendimentos * impostodeRendaPF;
	}

	@Override
	public Double calcularICMS() {
		return 0.0;
	}

}