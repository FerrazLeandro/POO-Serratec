package br.org.serratec.exemplos;

import java.util.Optional;

import br.org.serratec.model.Carro;
import br.org.serratec.model.Seguro;

public class TesteCarro {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total", 100.);
		Carro carro1 = new Carro("VW", "Gol", Optional.of(seguro));
		Carro carro2 = new Carro("Fiat", "Palio", Optional.ofNullable(null));

		System.out.println(carro1);

		if (carro2.getSeguro().isPresent()) {
			System.out.println(carro2);
		}

	}

}
