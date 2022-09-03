package org.br.serratec.model;

public class Medico extends PlanoDeSaude {
	private Integer crm;
	private String nome;

	public Medico(String empresa, Integer crm, String nome) {
		super(empresa);
		this.crm = crm;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Empresa: " + empresa + " || Nome: " + nome + " || CRM: " + crm + " || "; 
	}

	public Integer getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public Double calcularConsulta() {
		return valorPago = super.calcularConsulta() * 1.10;
	}
}
