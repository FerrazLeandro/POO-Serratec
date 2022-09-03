package br.org.serratec.teste;

import br.org.serratec.model.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.numeroConta = 123;
		conta.titular = "Leandro";
		conta.saldo = 100.00;
		
		conta.deposito(500);
		
		if (conta.saque(200)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("SAldo atual: " + conta.saldo);
	}

}
