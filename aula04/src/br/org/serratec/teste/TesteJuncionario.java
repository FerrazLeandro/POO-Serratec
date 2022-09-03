package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteJuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("05838594705", "Leandro", 5000., "Financeiro");
		gerente.aumentarSalario();
		
		System.out.println("Dados: " + gerente.getNome() + "\nCPF: " + gerente.getCpf() + "\nFunção: " + gerente.getSalario());
		
		System.out.println("");
		
		Assistente assistente = new Assistente("91500265772", "Sidineia", 10000., "TI");
		System.out.println("Dados: " + assistente.getNome() + "\nCPF: " + assistente.getCpf() + "\nFunção: " + assistente.getSalario());

	}

}
