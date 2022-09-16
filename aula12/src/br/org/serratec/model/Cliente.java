package br.org.serratec.model;

public class Cliente {
	private Integer codigo;
	private String nome;
	private String telefone;
	private String email;
	public Cliente(Integer codigo, String nome, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Codigo: " + codigo + " Nome: " + nome + " Email: " + email + " Telefone: " + telefone + "\n";
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
}
