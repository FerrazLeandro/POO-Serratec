package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.org.serratec.model.Aluno;
import br.org.serratec.model.ExibirDadosAluno;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(new Aluno("Leandro", "l@teste.com", 27),
				new Aluno("Giovanna", "g@teste.com", 7));
		System.out.println("--- Dados do Aluno Normal---");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		ExibirDadosAluno exibirDadosAluno = new ExibirDadosAluno();

		// Utilizando Consumer
		Consumer<Aluno> exibirDadosAluno2 = new Consumer<Aluno>() {

			@Override
			public void accept(Aluno t) {
				System.out.println("--- Dados do Aluno Consumer---");
				System.out.println(t.getNome());
				System.out.println(t.getEmail());
				System.out.println(t.getIdade());
			}

		};
		alunos.forEach(exibirDadosAluno2);

		// Função lambda
		alunos.forEach(t -> {
			System.out.println("--- Dados do Aluno Lambda---");
			System.out.println(t.getNome());
			System.out.println(t.getEmail());
			System.out.println(t.getIdade());
		});

	}

}
