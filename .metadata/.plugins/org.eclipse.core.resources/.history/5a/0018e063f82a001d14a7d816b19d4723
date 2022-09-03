package br.org.serratec.model;

public class VendedorFixo extends Vendedor {
	private Double salarioBase;
	private Double venda;
	private Double salarioBruto;
	public static Double totalVendido;

	public VendedorFixo(String nome, String cpf, Double salarioBase) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public Double getVenda() {
		return venda;
	}

	public void setVenda(Double venda) {
		this.venda = venda;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void calcularSalario() {
		salarioBruto = salarioBase + venda * 0.10;
	}
	
	public static Double calcularTotal() {
		return totalVendido;
	}
}
