package br.org.serratec.Exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {
		List<Fornecedor> leituraFornecedores = new ArrayList<>();
		List<Fornecedor> gravacaoFornecedores = new ArrayList<>();
		
		Fornecedor fornecedor1 = new Fornecedor("636455775", "Seratec", "s@teste.com");
		Fornecedor fornecedor2 = new Fornecedor("111548776", "Senai", "sen@teste.com");
		Fornecedor fornecedor3 = new Fornecedor("547876654", "Alterdata", "a@teste.com");

		
		gravacaoFornecedores.add(fornecedor1);
		gravacaoFornecedores.add(fornecedor2);
		gravacaoFornecedores.add(fornecedor3);
		
		System.out.println("--- Gravar os objetos em disco ---");
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("/Temp/Fornecedor.dat");
			ObjectOutput gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(gravacaoFornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.flush();
			arquivoGravar.close();
			System.out.println("Objeto gravado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}
		
		System.out.println("Recuperar objeto");
		try {
			FileInputStream arquivoLeitura = new FileInputStream("/Temp/Fornecedor.dat");
			ObjectInputStream leituraObjeto = new ObjectInputStream(arquivoLeitura);
		} catch (Exception e) {
		}
	}
	

}
