package org.br.serratec.model;

public class Clinica extends PlanoDeSaude {
	private String razaoSocial;
	private String cnpj;

	public Clinica(String empresa, String razaoSocial, String cnpj) {
		super(empresa);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empresa: " + empresa + " || Razão: " + razaoSocial + " || CNPJ: " + cnpj + " || ";
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

}
