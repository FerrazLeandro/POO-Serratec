package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.enuns.Bebida;
import br.org.serratec.enuns.Sanduiche;

public class Pedido {
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;

	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
		super();
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}

	@Override
	public String toString() {
		return "Data do pedido: " + dataPedido + " Bebida: " + bebida + " Sanduiche: " + sanduiche;
	}



	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}
	
	public void imprimirCardapio() {
		System.out.println("CARDAPIO");
		System.out.println("\nBebida");
		for (Bebida bebida : Bebida.values()) {
			System.out.println(bebida);
		}
		System.out.println("\nSanduiche");
		for (Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println(sanduiche);
		}
		
	}

}
