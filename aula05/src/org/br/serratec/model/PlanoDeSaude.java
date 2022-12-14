package org.br.serratec.model;

public class PlanoDeSaude {
	protected String empresa;
	protected Double valorPago = 80.;
	protected Double valorISS = 5.0;

	public PlanoDeSaude(String empresa) {
		super();
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public Double getValorISS() {
		return valorISS;
	}

	public Double calcularConsulta() {
		return valorPago = valorPago - (valorPago * (valorISS / 100));
	}
	
}
