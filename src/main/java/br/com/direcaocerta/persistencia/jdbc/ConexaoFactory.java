package br.com.direcaocerta.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	/**
	 * 
	 * @return
	 */
	public static Connection getConnection() {

		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/direcaocerta",
					"postgres", "postgres");
		} catch (SQLException e) {
		
			throw new RuntimeException(e);
		}
	}
}
