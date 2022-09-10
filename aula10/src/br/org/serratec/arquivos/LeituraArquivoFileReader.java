package br.org.serratec.arquivos;

import java.io.FileReader;
import java.util.Scanner;

public class LeituraArquivoFileReader {

	public static void main(String[] args) {
		try {
			//File reader fr = new FileReader("/Temp/Hello.txt");
			Scanner sc = new Scanner(new FileReader("/Temp/Hello.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado!");
		}
		

	}

}
