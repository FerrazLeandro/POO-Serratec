package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo3Stream {

	public static void main(String[] args) {
		List<Integer> numero = Arrays.asList(10, 100 , 200, 400, 100, 1200, 40);

		System.out.println("\nLista original");
		numero.forEach(t -> System.out.println(t));
		
		System.out.println("\nLista alterada");
		numero.stream().map(t -> t + 10).forEach(t -> System.out.println(t));
		
		System.out.println("\nOrdena do maior  para o menor");
		numero.stream().sorted().forEach(n -> System.out.println(n));
		
		System.out.println("\nOrdena do maior  para o menor sem exibir repetidos");
		numero.stream().distinct().sorted().forEach(n -> System.out.println(n));
		
		
		System.out.println("\nLista convertendo string para double");
		List<String> numeros2 = Arrays.asList("30", "50", "180", "100", "200", "100");
		numeros2.stream().map(n -> new Double(n)).forEach(n -> System.out.println(n));
		
		System.out.println("\nContar quantos numeros forma convertidos");
		System.out.println(numeros2.stream().map(n -> new Double(n)).count());
		
		System.out.println("Ignorar os dois primeiros itens da lista");
		numeros2.stream().skip(2).forEach(n -> System.out.println(n));
		
		System.out.println("\nLimita os 3 primeiros elemenstos");
		numeros2.stream().limit(3).forEachOrdered(n -> System.out.println(n));
		
		System.out.println("\nIgnora numeros repetidos");
		numeros2.stream().distinct().forEach(n -> System.out.println(n));
		
	}

}
