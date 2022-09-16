package br.org.serratec.model;

public class Conta {
	private Integer numeroConta;
	private String titular;
	private Double saldo;
	public Conta(Integer numeroConta, String titular, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	
}
