package br.org.serratec.exemplos;

import java.util.Optional;

import br.org.serratec.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(1, "Leandro", null, 2500.);
		Optional<Funcionario> funcionario2 = null;
		
		
		System.out.println(funcionario.getNome());
		
		if (funcionario2.isPresent()){
			System.out.println(funcionario2.get().getNome());
		}else {
			System.out.println("Não instanciou!");
		}
		

		
	}

}
