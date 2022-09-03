package br.org.serratec.teste;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setCodigo(123);
		pessoa.setNome("Leandro");
		pessoa.setPeso(55.0);
		pessoa.setAltura(1.65);
		
		System.out.println("Pessoa 1 IMC é : " + pessoa.resultadoIMC());
		
		
		
		Pessoa pessoa2 = new Pessoa(123, "Leandro", 55.0, 1.65);
		
		System.out.println("Seu IMC com construtor é: " + pessoa2.resultadoIMC());
		

	}

}
