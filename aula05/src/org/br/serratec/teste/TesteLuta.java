package org.br.serratec.teste;

import org.br.serratec.model.Categoria;
import org.br.serratec.model.Luta;
import org.br.serratec.model.Lutador;

public class TesteLuta {

	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("PESO PESADO");
		Categoria categoria2 = new Categoria("PESO MÉDIO");
		
		Lutador lutador1 = new Lutador("Leandro", 60.5, 28, categoria2);
		Lutador lutador2 = new Lutador("Zé", 80.5, 32, categoria2);
		
		Luta luta = new Luta(lutador1, lutador2, false);
		
		System.out.println((luta.confirmacaoLuta()) ? "Luta confirmada" : "Luta cancelada");
	}

}
