package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.org.serratec.model.Aluno;

public class Exemplo4Ordenacao {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Mariana", "mari@hotmail.com", 55);
		Aluno aluno2 = new Aluno("Maria", "maria@hotmail.com", 15);
		Aluno aluno3 = new Aluno("Adriana", "a@gmail.com", 32);
		Aluno aluno4 = new Aluno("Oscar", "oscar@hotmail.com", 33);
		Aluno aluno5 = new Aluno("Sergio", "sergio@gmail.com", 81);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);
		
		
		System.out.println("\nComparar alunos pela idade maior para o menor, precisa implementar o compare to - Java anterior a 8");
		alunos.stream().sorted().forEach(n -> System.out.println(n));
		
		
		System.out.println("\nOrdenando pelo nome depois do java 8");
		Comparator<Aluno> ordenarPeloNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());
		Collections.sort(alunos, ordenarPeloNome);
		alunos.forEach(a -> System.out.println(a));
		
		
		System.out.println("\nOrdenar por email java 8");
		alunos.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
		alunos.forEach(a -> System.out.println(a));
		

	}

}
