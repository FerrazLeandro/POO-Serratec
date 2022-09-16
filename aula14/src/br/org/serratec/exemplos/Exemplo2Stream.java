package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;

import br.org.serratec.model.Aluno;

public class Exemplo2Stream {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Leandro", "l@teste.com", 27);
		Aluno aluno2 = new Aluno("Kamylla", "k@teste.com", 19);
		Aluno aluno3 = new Aluno("Giovanna", "G@teste.com", 7);
		Aluno aluno4 = new Aluno("sidineia", "S@teste.com", 61);
		Aluno aluno5 = new Aluno("Fabiana", "f@teste.com", 35);
		Aluno aluno6 = new Aluno("Erocedes", "e@teste.com", 68);
		
		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
		
		
		// Para usar o lambda tem que ser funcional (Ter só um metodo na interface
		
		System.out.println("-- Filtro pela idade maior que 50");
		alunos.stream().filter(a -> a.getIdade() > 50).forEach(t -> System.out.println(t));
		
		System.out.println("-- Filtro pelo nome que começe com M");
		alunos.stream().filter(a-> a.getNome().startsWith("M")).forEach(t -> System.out.println(t));
	}

}
