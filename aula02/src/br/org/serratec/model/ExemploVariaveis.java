package br.org.serratec.model;

public class ExemploVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Leandro";
		int idade = 18;
		float altura = 1.85f;
		double peso = 89.90;
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso);
		
		if (idade > 18 || altura >= 1.80) {
			System.out.println("Competirá");
		} else {
			System.out.println("Não competirá");
		}
		
		String resposta = idade > 18 || altura >= 1.80 ? "Competirá":"Não competirá";
			System.out.println("Ternário: " + resposta);
	}

}
