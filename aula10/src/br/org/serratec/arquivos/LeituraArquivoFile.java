package br.org.serratec.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivoFile {

	public static void main(String[] args) {
		try {
			File arquivo = new File("C:/Temp/Hello.txt");
			Scanner sc = new Scanner(arquivo);
			sc.useDelimiter(";");
			System.out.println(arquivo);
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		
		

	}

}
