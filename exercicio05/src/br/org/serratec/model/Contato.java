package br.org.serratec.model;

import java.util.Arrays;

public class Contato {
	protected String nome;
	private Telefone[] telefones;

	public Contato(String nome, Telefone[] telefones) {
		super();
		this.nome = nome;
		this.telefones = telefones;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public void adicionarTelefone(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone;
				break;
			}
		}
	}

	public void listarTelefones() {
		System.out.println();
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone: " + telefones[i].getNumero());
		}
	}

}
