package br.org.serratec.model;

// A classe não poderá ser instanciada
public abstract class Empregado {
	private String cpf;
	private String nome;
	protected Double salario;
	
	public Empregado(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado CPF: " + cpf + " Nome: " + nome + " Salario: " + String.format("%.2f", salario);
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
	
	// É uma assinatura de método abstrato. Este método não tem implementação
	// Todos os filhos obrigatoriamente devem implementar
	public abstract void aumentarSalario();
	
}
