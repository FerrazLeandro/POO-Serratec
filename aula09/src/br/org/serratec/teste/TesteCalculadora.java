package br.org.serratec.teste;

import br.org.serratec.model.CalculoMedia;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		try {
			
			//Valida o código
			CalculoMedia.calcular(10, 0);
			System.out.println("Comandos");
			
		} catch (ArithmeticException e) {
			
			// Se der erro no código acima vem para a exceção
			System.out.println("Exceção");
			
			// Esse comando captura a mensagem da exceção
			e.printStackTrace();
			
		} finally {
			
			System.out.println("Finally sempre é executado independente do resultado ");
			
		}
		

	}

}
