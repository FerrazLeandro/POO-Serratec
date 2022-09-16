package br.org.serratec.Teste;

import java.sql.Connection;

import br.org.serratec.conexao.ConnectionFactory;
import br.org.serratec.model.Cliente;
import br.org.serratec.persistence.ClienteDao;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(null, "Ricrdinho", "454513", "ri@teste.com");
		Cliente cliente2 = new Cliente(null, "Mariazinha", "21144785", "ma@teste.com");
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao clienteDao = new ClienteDao(connection);
		
		try {
			connection.setAutoCommit(false);
			clienteDao.inserirCliente(cliente);
			clienteDao.inserirCliente(cliente2);
			//connection.commit();
			connection.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//clienteDao.inserirCliente(cliente);
		//clienteDao.atualizarCliente(cliente);
		//clienteDao.removerCliente(cliente);
		//System.out.println(clienteDao.listarClientes());
		//System.out.println(clienteDao.listarCliente("Lea"));
	}
}
