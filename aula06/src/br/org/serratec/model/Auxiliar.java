package br.org.serratec.model;
// Classe abstract não pode ter instancia e não precisa implementar os metodos do pai
// Metodo abstrato os filhos tem que instanciar
public abstract class Auxiliar extends Empregado {
	protected String categoria;
	
	
	
	
	public Auxiliar(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}



}
