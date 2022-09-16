package br.org.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
		private String urlConexao = "jdbc:postgresql://localhost:5432/aula12";
		private String usuario = "postgres";
		private String senha = "postgres";
		private Connection connection;

		public Connection getConnection() {
			try {
				System.out.println("Conectando ao banco de dados!");
				connection = DriverManager.getConnection(urlConexao, usuario, senha);
				if (connection != null) {
					System.out.println("Conectado com sucesso !");
				} else {
					System.out.println("Não foi possível a conexão !");
				}
			} catch (SQLException e) {
				System.out.println("Erro ! Driver não encontrado !");
			}

			return connection;
		}
	
}
