package br.org.serratec.model;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular: " + titular + " Saldo: " + saldo;
	}
	
	
	
	
	public ContaCorrente(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}




	@Override
	public Boolean saque(Double valor) {
		if (saldo > valor) {
			saldo = saldo - valor - taxa;
			return true;
		}
		return false;
	}

	@Override
	public Boolean deposito(Double valor) {
		if (valor > 0 && valor < 1000) {
			saldo += valor;
			return true;
		}
		return false;

	}

}
