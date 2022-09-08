package br.org.serratec.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {

	public static void main(String[] args) {
		int a=10, b= 0;
		int vetor[] = {100, 200, 400};
		
		
		try {
			FileReader arquivo = new FileReader("/Temp/Teste.txt");
			System.out.println("Arquivo encontrado!");
			System.out.println(a/b);
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu uma exceção!");
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero");
		}

	}

}
