package br.serratec.org.teste;

import java.time.LocalDateTime;

import br.serratec.org.arquivos.Importador;

public class TestePessoa {

	public static void main(String[] args) {
		//String arquivo;
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("Informe o diretório do arquivo: ");
		//arquivo = sc.next();
		System.out.println(LocalDateTime.now());
		Importador importador = new Importador();
		importador.teste();
		
		//sc.close();
	}

}
