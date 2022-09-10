package br.org.serratec.arquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ArquivoBinario {

	public static void main(String[] args) {
		try {
			FileOutputStream gravar = new FileOutputStream("/Temp/Teste.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(gravar);
			gravarArquivo.writeChars("Java Orientação a objetos !");
			gravarArquivo.close();
			
			
		} catch (Exception e) {
			System.out.println("Erro na gravação do arquivo!");
		}

	}

}
