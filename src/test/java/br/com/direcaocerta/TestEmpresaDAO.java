package br.com.direcaocerta;

import br.com.direcaocerta.entidades.Empresa;
import br.com.direcaocerta.persistencia.jdbc.EmpresaDAO;

public class TestEmpresaDAO {

	public static void main(String[] args) {

		// testCadastrar();
		//testAlterar();
		 testExcluir();
	}

	public static void testCadastrar() {

		Empresa empresa = new Empresa();

		// Criando a Empresa no banco

		empresa.setId_empresa(1);
		empresa.setNome_empresa("test");
		empresa.setLogin_empresa("algo@hotmail.com");
		empresa.setSenha_empresa("123");
		empresa.setCnpj_empresa("1231231234134");
		empresa.setTelefone_empresa("81 999999");

		EmpresaDAO empresaDao = new EmpresaDAO();
		empresaDao.cadastrar(empresa);

		System.out.println("Empresa Cadastrada com Sucesso!");
	}

	public static void testAlterar() {

		Empresa empresa = new Empresa();
		// Criando o administrador
		empresa.setId_empresa(2);
		empresa.setNome_empresa("xyz");
		empresa.setLogin_empresa("xyz@test.com");
		empresa.setSenha_empresa("xyz");
		empresa.setCnpj_empresa("12345678910");
		empresa.setTelefone_empresa("81 9999 9999");

		EmpresaDAO empresaDao = new EmpresaDAO();
		empresaDao.alterar(empresa);

		System.out.println("Alterado com Sucesso!");
	}

	public static void testExcluir() {
		Empresa empresa = new Empresa();
		// Criando o administrador

		empresa.setId_empresa(1);

		EmpresaDAO empresaDao = new EmpresaDAO();
		empresaDao.excluir(empresa);

		System.out.println("Excluido com Sucesso!");

	}
}