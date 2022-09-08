package br.org.serratec.teste;

import br.org.serratec.enuns.EstadoCivil;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor setor = new Setor(01, "Desenvolvimento");
		Pessoa pessoa = new Pessoa("Leandro", "21993017615", "teste@teste.com", EstadoCivil.SOLTEIRO, setor);
		
		System.out.println(pessoa);
		
		
		System.out.println("\nTipos de estado civil: ");
		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil);
		}
	}

}
