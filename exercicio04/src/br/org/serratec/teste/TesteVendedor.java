package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.VendedorFixo;

public class TesteVendedor {

	public static void main(String[] args) {
		int vendedor;
		VendedorFixo id;
		
		Scanner sc = new Scanner(System.in);
		VendedorFixo vendedorFixo = new VendedorFixo("Leandro", "12345", 1000.);
		VendedorFixo vendedorFixo2 = new VendedorFixo("Joana", "12345", 2000.);

		System.out.println("----------- Vendedores -----------");
		System.out.println("1-" + vendedorFixo.getNome());
		System.out.println("2-" + vendedorFixo2.getNome());
		System.out.print("\nEscolha o vendedor: ");
		
		vendedor = sc.nextInt();
		if (vendedor == 1) {
			id = vendedorFixo;
		} else {
			id = vendedorFixo2;
		}

		System.out.print("Digite o valor da venda: ");
		id.setVenda(sc.nextDouble());

		id.calcularSalario();
		
		System.out.println("----------- Salário dos Vendedores -----------");
		System.out.println("Nome: " + vendedorFixo.getNome() + "\nSalário: " + vendedorFixo.getSalarioBruto());
		System.out.println("Nome: " + vendedorFixo2.getNome() + "\nSalário: " + vendedorFixo2.getSalarioBruto());
		
		System.out.println("----------- Total Vendido -----------");
		System.out.println(id.calcularTotal());
		sc.close();
	}

}
