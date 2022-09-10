package br.org.serratec.teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.org.serratec.enuns.Categoria;
import br.org.serratec.model.Produto;
import br.org.serratec.model.Venda;

public class TesteVenda {

	public static void main(String[] args) {
		Produto produto1 =  new Produto(01, "LG", 3000., Categoria.ELETRONICO);
		Produto produto2 =  new Produto(02, "Godyear", 800., Categoria.AUTOMOTIVO);
		Produto produto3 =  new Produto(03, "Iphone", 2500., Categoria.ELETRONICO);
		
		
		Venda venda1 = new Venda(produto1, LocalDate.now(), 1);
		Venda venda2 = new Venda(produto2, LocalDate.now(), 1);
		Venda venda3 = new Venda(produto3, LocalDate.now(), 1);

		venda1.calcularVenda(produto1);
		venda2.calcularVenda(produto2);
		venda3.calcularVenda(produto3);
		
		System.out.println(venda1);
	}

}
