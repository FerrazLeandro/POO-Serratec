package br.org.serratec.model;

public class ExemploRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vetor = {"Leandro", "Giovanna"};
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("------------------------------");
		
		for (String nome : vetor) {
			System.out.println(nome);
		}
	}

}
