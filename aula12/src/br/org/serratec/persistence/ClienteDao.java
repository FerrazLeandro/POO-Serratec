package br.org.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.org.serratec.conexao.ConnectionFactory;
import br.org.serratec.model.Cliente;

public class ClienteDao {
	private Connection connection;
/*
	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();

	}
*/
	public ClienteDao(Connection con) {
		connection = con;

	}
	
	public void inserirCliente(Cliente cliente) {
		try {
			String sql = "insert into cliente (nome, telefone, email) values (?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
			//connection.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o registro!");
		}
	}
	
	public void atualizarCliente(Cliente cliente) {
		try {
			String sql = "update cliente set nome=?, telefone=?, email=? where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Não foi possível alterar o registro!");
		}
	}
	
	
	public void removerCliente(Cliente cliente) {
		try {
			String sql = "delete from cliente where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Não foi possível excluir o registro!");
		}
	}
	
	public List<Cliente> listarClientes(){
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			String sql = "select * from cliente";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"), 
											  rs.getString("nome"), 
											  rs.getString("telefone"), 
											  rs.getString("email"));
				clientes.add(cliente);
			}
			stmt.close();
			rs.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar clientes");
			e.printStackTrace();
		}
		
		return clientes;
	}
	
	
	public List<Cliente> listarCliente(String pesquisa){
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			String sql = "select * from cliente where nome like '%" + pesquisa + "%'";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"), 
											  rs.getString("nome"), 
											  rs.getString("telefone"), 
											  rs.getString("email"));
				clientes.add(cliente);
			}
			stmt.close();
			rs.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar clientes");
			e.printStackTrace();
		}
		
		return clientes;
	}
}
