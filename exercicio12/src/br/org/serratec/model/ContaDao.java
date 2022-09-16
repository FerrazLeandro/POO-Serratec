package br.org.serratec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.org.serratec.conexao.ConnectionFactory;

public class ContaDao {
	private Connection connection;
	
	public void contaDao() {
		connection = new ConnectionFactory().getConnection();
		
	}
	
	public void inserirConta(Conta conta) {
		try {
			String sql = "insert into conta (numero_conta, titular_conta, saldor_conta) values (?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1,  conta.getNumeroConta());
			stmt.setString(2, conta.getTitular());
			stmt.setDouble(3, conta.getSaldo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao inserir");
		}
	}
}
