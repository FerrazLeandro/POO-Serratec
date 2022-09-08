package br.org.serratec.teste;

import java.time.LocalDate;

import br.org.serratec.enuns.Bebida;
import br.org.serratec.enuns.Sanduiche;
import br.org.serratec.model.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HOTDOG);
		pedido.imprimirCardapio();
		System.out.println("\nDados do pedido: ");
		System.out.println(pedido);

	}

}
