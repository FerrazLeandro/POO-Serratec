package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo02LocalDate {

	public static void main(String[] args) {
		LocalDate nascimento = LocalDate.of(1995, 1, 25);
		LocalDate dataAtual = LocalDate.now();
		
		Period period = Period.between(nascimento, dataAtual);
		System.out.println("Idade: " + period.getYears() + " anos, " + period.getMonths() + " meses, " + period.getDays() + " dias");


	}

}
