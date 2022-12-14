package br.org.serratec.teste;

import br.org.serratec.model.Livro;
import br.org.serratec.model.Operacao;

public class TestaLivro {
	public static void main(String[] args) {
		Livro livro = new Livro("Marco Antônio", "Cisco CCNA", 85.);
		Livro livro2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.);
		
		Operacao op = new Operacao("Venda", 85.0, livro);
		Operacao op2 = new Operacao("Empréstimo", 100.0, livro2);
		
		livro.calcularReajuste(6.0);
		op.venderLivro(livro);
		op2.emprestarLivro(livro2);
		
		System.out.println(op);
		System.out.println(op2);
		
		
	}
}
