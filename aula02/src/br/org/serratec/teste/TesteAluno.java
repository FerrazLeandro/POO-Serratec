package br.org.serratec.teste;

import br.org.serratec.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("_________________");
		
		// Instancia = new
		Aluno aluno1 = new Aluno();	
		aluno1.matricula = 123;
		aluno1.nome = "Leandro";
		aluno1.email = "teste@test.com";
		
		System.out.println(aluno1.nome);
		
		Aluno aluno2 = new Aluno();	
		
		
		if (aluno1==aluno2) {
			System.out.println("Objetos iguais");
		}
	}

}
