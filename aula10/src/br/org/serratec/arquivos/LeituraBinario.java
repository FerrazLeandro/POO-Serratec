package br.org.serratec.arquivos;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class LeituraBinario {

	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("/Temp/Teste.dat");
			DataInputStream lerArquivo = new DataInputStream(arquivo);
			String resultado = lerArquivo.readLine();
			System.out.println(resultado);
			lerArquivo.close();
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado");
		}

	}

}
