package org.br.serratec.teste;

import org.br.serratec.model.Imovel;
import org.br.serratec.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Leandro", "ferraz@teste.com");
		Pessoa pessoa2 = new Pessoa("Kamylla", "kamy@teste.com");
		
		Imovel imovel = new Imovel("Casa", "Rio", 100000., pessoa1);
		
		System.out.println(imovel.getLocal() + " " +  imovel.getPessoa().getNome());
		

	}

}
