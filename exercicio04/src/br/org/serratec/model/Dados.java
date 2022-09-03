package br.org.serratec.model;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		Integer qtdPessoas = 2;
		String nome, nomeMaiorPeso = "", nomeMaiorAltura = "";
		double altura = 0, maiorAltura = 0, mediaAltura = 0, peso = 0, maiorPeso = 0, mediaPeso = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= qtdPessoas; i++) {
			System.out.print("Informe o " + i + "º nome: ");
			nome = sc.next();
			System.out.print("Informe o peso do(a) " + nome + ": ");
			peso  = sc.nextDouble();
			System.out.print("Informe a altura do(a) " + nome + ": ");
			altura = sc.nextDouble();
			System.out.println("");
			
			if (peso > maiorPeso) {
				maiorPeso = peso;
				nomeMaiorPeso = nome;
			}
				
			if (altura > maiorAltura) {
				maiorAltura = altura;
				nomeMaiorAltura = nome;
			}
			
			mediaPeso = mediaPeso + peso;
			mediaAltura= mediaAltura + altura;
		}
		
		mediaPeso = mediaPeso / qtdPessoas;
		mediaAltura = mediaAltura / qtdPessoas;
		
		
		System.out.println("Pessoa com maior peso: " + nomeMaiorPeso + " Peso: " + maiorPeso);
		System.out.println("Pessoa com maior altura: " + nomeMaiorAltura + " Altura: " + maiorAltura);
		System.out.println("Média de peso: " + mediaPeso);
		System.out.println("Média de altura: " + mediaAltura);

		sc.close();
	}

}
