package br.org.serratec.model;

import br.org.serratec.enuns.EstadoCivil;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	private EstadoCivil estadoCivil;
	private Setor setor;

	

	public Pessoa(String nome, String telefone, String email, EstadoCivil estadoCivil, Setor setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Telefone: " + telefone + " Email: " + email + " Estado Civil: " + estadoCivil + " Setor: " + setor.getDescricao();
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public Setor getSetor() {
		return setor;
	}
	
	

}
