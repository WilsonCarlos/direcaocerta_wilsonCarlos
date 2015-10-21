package br.com.direcaocerta.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	
	public static Connection getConnection(){
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/direcaocerta","postgres","postgres");
			System.out.println("Conectado Com Sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao conectar "+e.getMessage());
		}
		return con;
		}

}
