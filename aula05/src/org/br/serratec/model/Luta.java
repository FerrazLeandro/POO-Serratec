package org.br.serratec.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private Boolean confirmacao = false;

	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmacao) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmacao = confirmacao;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public Boolean getConfirmacao() {
		return confirmacao;
	}
	
	public Boolean confirmacaoLuta() {
		//Para a luta ser confirmada é necessário desafiante ser diferente do desafiadoe categorias iguais
		 if (!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())){
			 return true;
		 }
		 return false;
	}

}
