package br.org.serratec.model;

// Classe Final não pode ter herança
public class Policial {
	private String nome;
	private String matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
