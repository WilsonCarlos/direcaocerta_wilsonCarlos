package br.com.direcaocerta;

import br.com.direcaocerta.entidades.Administrador;
import br.com.direcaocerta.persistencia.jdbc.AdministradorDAO;

public class TestAdmistradorDAO {

	public static void main(String[] args) {

		// testCadastrar();
		// testAlterar();
		//testExcluir();
	}

	public static void testCadastrar() {
		Administrador administrador = new Administrador();
		// Criando o administrador
		administrador.setNome_administrador("Iron");
		administrador.setLogin_administrador("dylan@hotmail.com");
		administrador.setSenha_administrador("MaidenIron");
		administrador.setCpf_administrador("12345678910");

		AdministradorDAO administradorDao = new AdministradorDAO();
		administradorDao.cadastrar(administrador);

		System.out.println("Cadastrado com Sucesso!");
	}

	public static void testAlterar() {
		Administrador administrador = new Administrador();
		// Criando o administrador
		administrador.setId_administrador(1);
		administrador.setNome_administrador("TestAlterar");
		administrador.setLogin_administrador("Teste@test.com");
		administrador.setSenha_administrador("testado");
		administrador.setCpf_administrador("12345678910");

		AdministradorDAO administradorDao = new AdministradorDAO();
		administradorDao.alterar(administrador);

		System.out.println("Alterado com Sucesso!");
	}

	public static void testExcluir() {
		Administrador administrador = new Administrador();
		// Criando o administrador
		administrador.setId_administrador(6);

		AdministradorDAO administradorDao = new AdministradorDAO();
		administradorDao.excluir(administrador);

		System.out.println("Excluido com Sucesso!");
	}
}
