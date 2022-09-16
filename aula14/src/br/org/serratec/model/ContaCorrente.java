package br.org.serratec.model;

import br.org.serratec.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("Transação OK!");
	}
	
	@Override
	public void investimento() {
		System.out.println("Sobrescrevendo, Investimento OK!");
	}

}
