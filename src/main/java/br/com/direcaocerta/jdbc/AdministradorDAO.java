package br.com.direcaocerta.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.direcaocerta.entidades.Administrador;

public class AdministradorDAO {

	private Connection con = Conexao.getConnection();

	public void cadastrar(Administrador administrador) {

		String sql = "INSERT INTO ADMINISTRATOR(nome_admin, login_admin, senha_admin) " + "values (?,?,md5(?))";

		try {

			PreparedStatement preparador = con.prepareStatement(sql);

			
			preparador.setString(1, administrador.getNome_admin());
			preparador.setString(2, administrador.getLogin_admin());
			preparador.setString(3, administrador.getSenha_admin());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cadastrado com Sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public void alterar(Administrador administrador) {

		String sql = "UPDATE ADMINISTRADOR SET nome_admin=?, login_admin=?, senha_admin=?" + " WHERE id_admin=?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setString(1, administrador.getNome_admin());
			preparador.setString(2, administrador.getLogin_admin());
			preparador.setString(3, administrador.getSenha_admin());
			preparador.setInt(4, administrador.getId_admin());

			preparador.execute();
			preparador.close();
			System.out.println("Alterado com Sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public void excluir(Administrador administrador) {

		String sql = "DELETE FROM ADMINISTRADOR WHERE id_admin=?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setInt(1, administrador.getId_admin());

			preparador.execute();
			preparador.close();
			System.out.println("Deletado com Sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public List<Administrador> buscarTodos() {

		String sql = "SELECT * FROM ADMINISTRADOR";

		List<Administrador> lista = new ArrayList<Administrador>();

		try {

			PreparedStatement preparador = con.prepareStatement(sql);

			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {

				Administrador admin = new Administrador();

				admin.setId_admin(resultado.getInt("id_admin"));
				admin.setNome_admin(resultado.getString("nome_admin"));
				admin.setLogin_admin(resultado.getString("login_admin"));
				admin.setSenha_admin(resultado.getString("senha_admin"));

				lista.add(admin);
			}

			preparador.close();

			System.out.println("Busca efetuada com Sucesso!");

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return lista;

	}
}
