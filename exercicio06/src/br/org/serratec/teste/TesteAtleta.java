package br.org.serratec.teste;

import br.org.serratec.model.Atleta;
import br.org.serratec.model.Pais;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais pais = new Pais("Brasil");
		Pais pais2 = new Pais("USA");
		
		Atleta atleta = new Atleta("Anderson Silva", 98., pais);
		Atleta atleta2 = new Atleta("Jon Jone", 59., pais2);
		Atleta atleta3 = new Atleta("Vitor Belfort", 110., pais);
		
		System.out.println("O atleta " + atleta.getNome() + " " +  atleta.verificaSituacao());
		System.out.println("O atleta " + atleta2.getNome() + " " +  atleta2.verificaSituacao());
		System.out.println("O atleta " + atleta3.getNome() + " " +  atleta3.verificaSituacao());
		
		atleta.adicionarAtletas(atleta);
		atleta.adicionarAtletas(atleta2);
		atleta.adicionarAtletas(atleta3);
		
		System.out.println("Total de participantes: " + atleta.getTotalParticipantes());
	}

}
