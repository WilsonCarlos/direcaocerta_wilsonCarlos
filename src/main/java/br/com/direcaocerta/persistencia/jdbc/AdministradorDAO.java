package br.com.direcaocerta.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.direcaocerta.entidades.Administrador;

public class AdministradorDAO {

	private Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Administrador administrador) {
		
		String sql = "insert into administrador(nome_administrador, login_administrador, senha_administrador, cpf_administrador) values (?,?,?,?)";
			
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			//substitui as interrogaçoes pelos dados
			preparador.setString(1, administrador.getNome_administrador());
			preparador.setString(2, administrador.getLogin_administrador());
			preparador.setString(3, administrador.getSenha_administrador());
			preparador.setString(4, administrador.getCpf_administrador());
			//executando o comando no banco
			preparador.execute();
		
			
		} catch (SQLException e) {

			e.printStackTrace();
		}	
	}

	public void alterar(Administrador administrador) {

		String sql = "update administrador set nome_administrador = ?, login_administrador=?, senha_administrador=?, cpf_administrador=? where id_administrador=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			//substitui as interrogaçoes pelos dados
			preparador.setString(1, administrador.getNome_administrador());
			preparador.setString(2, administrador.getLogin_administrador());
			preparador.setString(3, administrador.getSenha_administrador());
			preparador.setString(4, administrador.getCpf_administrador());
			preparador.setInt(5, administrador.getId_administrador());
			//executando o comando no banco
			preparador.execute();
		
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	public void excluir(Administrador administrador) {
		// TODO Auto-generated method stub
		
String sql = "delete from administrador where id_administrador=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			//substitui as interrogaçoes pelos dados
			preparador.setInt(1, administrador.getId_administrador());
			//executando o comando no banco
			preparador.execute();
		
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}