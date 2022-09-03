package br.org.serratec.model;

public class Funcionario {
	private String cpf;
	private String nome;
	private Double salario;

	public Funcionario(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Double aumentarSalario () {
		return salario *= 1.10;
	}
}
