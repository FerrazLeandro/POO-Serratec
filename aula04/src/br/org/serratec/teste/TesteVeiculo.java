package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao("123", "ABC123", "Preto", 50000.00, 10000);
		
		caminhao.calcularIPVA();
		
		System.out.println("Dados: " + caminhao.getPlaca() + " Valor: " + caminhao.getValor() + " IPVA: " + caminhao.getValorIPVA());
		
		System.out.println("\n" + caminhao.toString());

	}

}
