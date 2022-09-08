package br.org.serratec.teste;

import br.org.serratec.enuns.MarcaTV;
import br.org.serratec.model.TV;

public class TesteTV {

	public static void main(String[] args) {
		TV tv = new TV("LM 625", 42, MarcaTV.LG);
		
		System.out.println(tv);

	}

}
