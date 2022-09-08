package br.org.serratec.model;

import java.time.LocalDate;

public abstract class Ave extends Animal {
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	public abstract String voar();

	public String getCor() {
		return cor;
	}
	
	

}
