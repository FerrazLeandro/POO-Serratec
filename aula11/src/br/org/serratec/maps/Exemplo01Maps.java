package br.org.serratec.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo01Maps {

	public static void main(String[] args) {
		
		// Sem ordenar
		//Map<String, String> estados = new HashMap<>();
		
		// Ordenando
		TreeMap<String, String> estados = new TreeMap<>();
		
		estados.put("AC", "ACRE");
		estados.put("RJ", "RIO");
		estados.put("SP", "SAO PAULO");
		estados.put("SE", "SERGIPE");

		
		System.out.println("Chave do mapa");
		for (String string : estados.keySet()) {
			System.out.println(string);
		}
		
		System.out.println("\nValor do mapa");
		for (String string : estados.values()) {
				System.out.println(string);
		}
		
		System.out.println("\nValor e chave");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			System.out.println(mapa.getKey() + " - " + mapa.getValue());
			
		}
	}

}
