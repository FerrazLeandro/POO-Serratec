package br.org.serratec.datas;

import java.time.Duration;
import java.time.LocalDateTime;

public class TesteDuration {

	public static void main(String[] args) {
		LocalDateTime primeiroPeriodo = LocalDateTime.now();
		LocalDateTime segundoPeriodo = LocalDateTime.of(2023, 01, 25, 22, 30);
		
		Duration duration = Duration.between(primeiroPeriodo, segundoPeriodo);
		
		Long dias = duration.toDays();
		Long horas = duration.toHours();
		
		System.out.println("Faltam " + dias + " dias para seu aniversário!");
		System.out.println("Faltam " + horas + " horas para seu aniversário!");
	}

}
