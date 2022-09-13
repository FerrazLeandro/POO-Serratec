package br.org.serratec.Teste;

import br.org.serratec.model.Sorteio;

public class TesteSorteio {

	public static void main(String[] args) {
		Integer numero = 547;
		Integer numero2 = 10;
		Integer numero3 = 3545;
		Integer numero4 = -145;
		Integer numero5 = 2;
		Integer numero6 = 47;
		Integer numero7 = 769;
		Integer numero8 = 14;
		Integer numero9 = 1;
		
		
		Sorteio<Integer> sorteio = new Sorteio<>();
		
		sorteio.adicionar(numero);
		sorteio.adicionar(numero2);
		sorteio.adicionar(numero3);
		sorteio.adicionar(numero4);
		sorteio.adicionar(numero5);
		sorteio.adicionar(numero6);
		sorteio.adicionar(numero7);
		sorteio.adicionar(numero8);
		sorteio.adicionar(numero9);
		
		System.out.println(sorteio.sorteio());
		
	}

}
