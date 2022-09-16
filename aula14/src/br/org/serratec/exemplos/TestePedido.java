package br.org.serratec.exemplos;

import br.org.serratec.pedido.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido();
		pedido1.finalizarPedido();
		
		// Classe anonima
		Pedido pedido2 = new Pedido() {
			@Override
			public void finalizarPedido() {
				System.out.println("Pedido enviado com sucesso");
			}
		};
		pedido2.finalizarPedido();

	}
	

}
