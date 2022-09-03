package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		int opcao = 0, quantidade;
		double valor;
		String descricao, menu;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Produto: ");
			descricao = sc.next();

			System.out.print("Valor: ");
			valor = sc.nextDouble();

			System.out.print("Quantidade: ");
			quantidade = sc.nextInt();

			Produto prod = new Produto(descricao, valor, quantidade);

			System.out.println("Descrição: " + prod.getDescricao());
			System.out.println("Valor: " + prod.getValor());
			System.out.println("Total: " + prod.getTotal());
			System.out.println("ICMS: " + prod.calcularIcms());

			System.out.println("Deseja encerrar o programa (S/N) ?");
			menu = sc.next();

			if (menu == "S") {
				opcao = 1;
			}

		} while (opcao != 1);
		
		sc.close();

	}

}
