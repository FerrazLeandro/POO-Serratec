package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Stream {

	public static void main(String[] args) {		
		List<String> times = Arrays.asList("Flamengo","Fluminense","Vasco","Botafogo");
		times.forEach(t -> System.out.println(t));

		//Stream - metodo que permite filtros, ordenações, e outras operações
		times.stream().map(t -> t.substring(0, 3)).forEach(t ->System.out.println(t));
		
		List<String> timesAbreviados = times.stream().map(t -> t.substring(0, 3)).collect(Collectors.toList());
		timesAbreviados.forEach(t -> System.out.println(t));
		

	}

}
