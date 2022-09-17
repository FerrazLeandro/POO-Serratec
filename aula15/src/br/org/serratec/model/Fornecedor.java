package br.org.serratec.model;

import java.io.Serializable;

/** Clase para criação de objeto fornecedor
 * @author Leandro Ferraz
 * @since 16/09/2022
 * @version 1.0
 *  
 * */
public class Fornecedor implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	/**
	 * Identificação única  
	 * */
	private String cnpj;
	/**
	 * Razao social da empresa
	 */
	private String nome;
	/**
	 * Razao email da empresa
	 */
	private String email;
	
	/**
	 * 
	 * @param cnpj cnpj
	 * @param nome nome
	 * @param email email
	 */
	public Fornecedor(String cnpj, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}
	
	/**
	 * 
	 * @return cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

}
