package br.org.serratec.datas;

import java.time.LocalDate;

public class ExemploLocalDate {

	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		LocalDate dataEntrada = LocalDate.of(2022, 9, 11);
		
		System.out.println("Data atual com now: " + data);
		System.out.println(dataEntrada);

		LocalDate dataConvertida = LocalDate.parse("2022-09-12");
		System.out.println("Data atual inserida: " + dataConvertida);
		
		
		System.out.println("Data atual após 3 dias: " + data.plusDays(3));
		System.out.println("Data atual anterior 3 meses: " + data.minusMonths(3));
		
		
		
	}

}
