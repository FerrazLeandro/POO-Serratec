package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalImpostos;

public class TesteImpostodeRenda {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Leandro", 8200.);
		Empresa empresa = new Empresa("Alterdata", 259000.);
		TotalImpostos t =  new TotalImpostos();
		

		
		System.out.println(pessoa + ", IRRF: " + pessoa.calcularImpostoDeRenda());
		System.out.println(empresa + ", ICMS: " + empresa.calcularICMS() + ", IRRF: " + empresa.calcularImpostoDeRenda());
		
		t.calcularTotal(pessoa);
		t.calcularTotal(empresa);
		
		System.out.println("Total geral: " +  t.getTotalGeral());
	}

}
