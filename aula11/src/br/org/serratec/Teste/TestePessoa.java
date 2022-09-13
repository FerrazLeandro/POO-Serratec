package br.org.serratec.Teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Kamylla", "k@gmail.com", 19);
		Pessoa p2 = new Pessoa("Leandro", "l@gmail.com", 27);
		Pessoa p3 = new Pessoa("Giovanna", "g@gmail.com", 7);
		
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		System.out.println(pessoas);

	}

}
