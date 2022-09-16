package br.org.serratec.exemplos;

import br.org.serratec.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		// Classe anonima baseado em uma interface
		//Para transformar o código acima em um lambda, selecionar desde o new Conta() 
		//até a chaves antes do ponto e vírgula, após isso dar ctrl+1 e converter.
		Conta conta = new Conta(){

			@Override
			public void transacao() {
				System.out.println("Transação efetuada");
				
			}
			
		};
		conta.transacao();
		// Programação funcional a partir da versão 8
		// Programação funcional é com base em interfaces
		// Para a interface ser funcional só pode ter um metodo abstrato, pode ter vários metodos default pois não é obrigado implementar
		// Dentro de () são os argumentos (Parâmetros)
		//O código abaixo representa o da linha 9 a 17
		Conta conta2 = ()-> System.out.println("Transação efetuada");
		conta2.transacao();

	}

}
