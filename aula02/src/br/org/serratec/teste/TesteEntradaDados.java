package br.org.serratec.teste;

import java.util.Scanner;

public class TesteEntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Informe o valor A: ");
		a = sc.nextInt();
		
		System.out.print("Informe o valor B: ");
		b = sc.nextInt();
		
		System.out.print("\nResultado: " + (a + b));
		
		sc.close();
	}

}
