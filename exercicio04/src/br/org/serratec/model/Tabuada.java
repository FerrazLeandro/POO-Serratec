package br.org.serratec.model;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Integer numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		System.out.println("+---Resultado---+");
		
		for (int i = 1; i < 10; i++) {
			System.out.println("|   " + i +  " * " + numero + " = " + (i * numero) + "   |");
		}
		
		System.out.println("+---------------+");
		
		sc.close();
	}
	

}
