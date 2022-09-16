package br.org.serratec.interfaces;

public interface Conta {
	public void transacao();
	
	// Metodo default - São metodos que contem implementação
	
	default void investimento() {
		System.out.println("Você aplicou em um investimento");
	}
	
}
