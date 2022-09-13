package br.org.serratec.horas;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemploHora {

	public static void main(String[] args) {
		LocalTime hora = LocalTime.of(22, 05);
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora informada: " + hora);
		System.out.println("Hora atual: " + horaAtual);
		
		
		System.out.println("Hora atual acrescida de 2 horas: " + horaAtual.plusHours(2));
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println("Data e hora atual: " + dataHora);
	}

}
