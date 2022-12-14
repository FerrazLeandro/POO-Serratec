package br.org.serratec.model;

public class Conta {
	// Atributos - Caracteristicas
	
	public int numeroConta;
	public String titular;
	public double saldo;
	
	// Metodos - Ação
	
	// Metodo sem retorno
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	// Metodo com retorno
	public boolean saque(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo = saldo - valor;
			return true;
		}
	}
}
