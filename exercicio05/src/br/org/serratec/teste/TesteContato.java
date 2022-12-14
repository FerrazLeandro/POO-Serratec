package br.org.serratec.teste;

import br.org.serratec.model.Cidade;
import br.org.serratec.model.Contato;
import br.org.serratec.model.Endereco;
import br.org.serratec.model.Estado;
import br.org.serratec.model.Telefone;

public class TesteContato {

	public static void main(String[] args) {
		Telefone telefone = new Telefone("2234-1250");
		Telefone telefone2 = new Telefone("2237-1350");
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Petrópolis", estado);
		Endereco endereco = new Endereco("Fonseca Ramos 181", "Centro", "25954210", cidade);
		Contato contato = new Contato("Roberta", new Telefone[2]);
		
		contato.adicionarTelefone(telefone);
		contato.adicionarTelefone(telefone2);
		
		System.out.printf(contato + "\n" + endereco);
		contato.listarTelefones();

	}

}
