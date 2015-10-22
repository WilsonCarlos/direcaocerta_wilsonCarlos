package br.com.direcaocerta.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.direcaocerta.entidades.Administrador;
import br.com.direcaocerta.entidades.Empresa;

public class EmpresaDAO {

	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Empresa empresa) {

		String sql = "insert into empresas(nome_empresa, login_empresa, senha_empresa, cnpj_empresa, telefone_empresa) values (?,?,?,?,?)";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {

			// substitui as interrogaçoes pelos dados
			preparador.setString(1, empresa.getNome_empresa());
			preparador.setString(2, empresa.getLogin_empresa());
			preparador.setString(3, empresa.getSenha_empresa());
			preparador.setString(4, empresa.getCnpj_empresa());
			preparador.setString(5, empresa.getTelefone_empresa());

			// executando o comando no banco
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void alterar(Empresa empresa) {

		String sql = "update empresas set nome_empresa=?, login_empresa=?, senha_empresa=?, cnpj_empresa=?, telefone_empresa=? where id_empresa=?";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			// substitui as interrogaçoes pelos dados
			preparador.setString(1, empresa.getNome_empresa());
			preparador.setString(2, empresa.getLogin_empresa());
			preparador.setString(3, empresa.getSenha_empresa());
			preparador.setString(4, empresa.getCnpj_empresa());
			preparador.setString(5, empresa.getTelefone_empresa());
			preparador.setInt(6, empresa.getId_empresa());
			// executando o comando no banco
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void excluir(Empresa empresa) {
		// TODO Auto-generated method stub

		String sql = "delete from empresas where id_empresa=?";

		try (PreparedStatement preparador = con.prepareStatement(sql)) {
			// substitui as interrogaçoes pelos dados
			preparador.setInt(1, empresa.getId_empresa());
			// executando o comando no banco
			preparador.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	public void salvar(Empresa empresa){
		if (empresa.getId_empresa()!=null) {
			alterar(empresa);
		}else{
			cadastrar(empresa);
		}
	}
}