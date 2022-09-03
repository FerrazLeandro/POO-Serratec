package br.org.serratec.model;

public class TotalImpostos {
	private Double totalGeral = 0.0;

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}

	// Quem implementa a interface também pode utilizar polimorfismo
	public void calcularTotal(Tributacao t) {
		totalGeral += t.calcularICMS() + t.calcularImpostoDeRenda();
	}
	
}
