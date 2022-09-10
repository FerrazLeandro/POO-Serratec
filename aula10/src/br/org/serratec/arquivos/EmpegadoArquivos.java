package br.org.serratec.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.org.serratec.model.Empregado;

public class EmpegadoArquivos {

	public static void main(String[] args) {
		File arquivo = new File("/Temp/Funcionarios.txt");
		
		try {
			Scanner sc = new Scanner(arquivo);
			
			Set<Empregado> empregados = new HashSet<>();
			//Leitura
			
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");
					empregados.add(new Empregado(vetor[0], vetor[1]));
				}
			}
			sc.close();
			
			System.out.println("Dados");
			for (Empregado empregado : empregados) {
				System.out.println(empregado);
			}
			
			
			// Escrita
			//FileWriter arquivoGravar = new FileWriter("/Temp/EmpregadoSaida.txt");
			PrintWriter gravacaoArquivo = new PrintWriter("/Temp/EmpregadoSaida.txt");
			for (Empregado empregado : empregados) {
				String linha = empregado.getCpf() + " " + empregado.getNome() + "\n";
				gravacaoArquivo.print(linha);
			}
			
		System.out.println("Arquivo gravado com sucesso");
		gravacaoArquivo.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu erro no arquivo.");
		}

	}

}
