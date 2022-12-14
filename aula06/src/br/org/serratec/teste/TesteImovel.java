package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Imovel;
import br.org.serratec.model.Proprietario;

public class TesteImovel {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Leandro");
		Imovel casa = new Casa("Centro", 40950., true);
			
		casa.setProprietario(proprietario);
		
		System.out.println("Dados: \n" + casa  + " Proprietario: " +  casa.getProprietario().getNome());
		
		
		Proprietario proprietario2 = new Proprietario("Kamy");
		Imovel apartamento = new Apartamento("Alto", 597520., 2);
			
		apartamento.setProprietario(proprietario2);
		
		System.out.println("Dados: \n" + apartamento + " Proprietario: " +  apartamento.getProprietario().getNome());

	}

}
