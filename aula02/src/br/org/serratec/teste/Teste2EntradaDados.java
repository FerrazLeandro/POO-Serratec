package br.org.serratec.teste;

import java.util.Scanner;

public class Teste2EntradaDados {

	public static void main(String[] args) {
		String nome;
		int idade;
		double altura;
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		nome = sc.next();
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();
		
		System.out.printf("%s tem %d anos e %.2f metros!", nome, idade, altura);

		sc.close();
	}

}
