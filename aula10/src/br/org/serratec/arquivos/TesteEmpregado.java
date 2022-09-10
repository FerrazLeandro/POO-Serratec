package br.org.serratec.arquivos;

import br.org.serratec.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("123", "Leandro");
		Empregado empregado2 = new Empregado("123", "Leandro");
		
		if (empregado1.equals(empregado2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
	}

}
