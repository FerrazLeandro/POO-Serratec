package br.serratec.org.arquivos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.serratec.org.model.Funcionario;

public class Importador {
	public void teste() {
		File arquivo = new File("/Temp/Funcionarios.txt");
		
		try {
			Scanner sc = new Scanner(arquivo);
			
			Set<Funcionario> funcionarios = new HashSet<>();
			//Leitura
			
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");
					String data = vetor[2];
					LocalDate dataAjustada = LocalDate.parse(data);
					Double salarioBruto = Double.parseDouble(vetor[3]);
					funcionarios.add(new Funcionario(vetor[0], vetor[1], dataAjustada, salarioBruto));
				}
			}
			sc.close();
			
			System.out.println("Dados");
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}
			
			
			{	// Escrita
			//FileWriter arquivoGravar = new FileWriter("/Temp/EmpregadoSaida.txt");
			PrintWriter gravacaoArquivo = new PrintWriter("/Temp/EmpregadoSaida.txt");
			for (Funcionario funcionario : funcionarios) {
				String linha = funcionario.getCpf() + " " + funcionario.getNome() + "\n";
				gravacaoArquivo.print(linha);
			}
			
		System.out.println("Arquivo gravado com sucesso");
		gravacaoArquivo.close();
			}	
		} catch (IOException e) {
			System.out.println("Ocorreu erro no arquivo.");
		}
	}
}
