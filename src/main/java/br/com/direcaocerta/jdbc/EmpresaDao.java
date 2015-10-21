package br.com.direcaocerta.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.direcaocerta.entidades.Administrador;
import br.com.direcaocerta.entidades.Empresa;

public class EmpresaDao {
	
	private Connection con;

	public EmpresaDao() {
		con = Conexao.getConnection();
	}

	public void cadastrar(Empresa empresa) {

		String sql = "insert into empresa (cnpj, nome, senha, email) values (?, ?, md5(?), ?)";

		try {

			PreparedStatement preparadorSQL = con.prepareStatement(sql);
			
			preparadorSQL.setString(1, empresa.getNome());
			preparadorSQL.setString(2, empresa.getEmail());
			preparadorSQL.setString(3, empresa.getSenha());
			preparadorSQL.setString(4, empresa.getCnpj());
			
			// Commit no banco
			preparadorSQL.execute();
			preparadorSQL.close();
			
			System.out.println("Empresa Cadastrada com sucesso");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao tentar se cadastrar a empresa "+e.getMessage());
		}
	}
}
