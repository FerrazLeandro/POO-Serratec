package br.org.serratec.teste;

import java.sql.Connection;

import br.org.serratec.connection.ConnectionFactorySingleton;

public class TesteConection {

	public static void main(String[] args) {
		Connection con = ConnectionFactorySingleton.getConnection();
		

	}

}
