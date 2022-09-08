package br.org.serratec.teste;

import br.org.serratec.enuns.PeriodoCurso;
import br.org.serratec.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", PeriodoCurso.INTEGRAL);
		
		System.out.println("Nome: " + curso.getNome());
		System.out.println("Dia da semana: " + curso.getPeriodo().getDiasDaSemana());

	}

}
