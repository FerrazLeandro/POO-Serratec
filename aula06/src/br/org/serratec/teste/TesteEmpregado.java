package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		Diretor diretor = new Diretor("05838594705", "Leandro", 5650., "Geral");
		Assistente assistente = new Assistente("91500265772", "Sidineia", 2424., 500.);
		Gerente gerente = new Gerente("83527222715", "Erocedes", 3246., "Intermediario");
		
		
		diretor.aumentarSalario();
		assistente.aumentarSalario();
		gerente.aumentarSalario();
		
		System.out.println(diretor);
		System.out.println(assistente);
		System.out.println(gerente);

	}

}
