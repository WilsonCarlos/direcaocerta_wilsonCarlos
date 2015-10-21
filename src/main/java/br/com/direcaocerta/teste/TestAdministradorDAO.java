package br.com.direcaocerta.teste;

import java.util.List;

import br.com.direcaocerta.entidades.Administrador;
import br.com.direcaocerta.jdbc.AdministradorDAO;

public class TestAdministradorDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testCadastrar();
		//testAlterar();
		//testExcluir();
		//TestBuscarTodos();
	}

	private static void testCadastrar() {
		Administrador admin = new Administrador();
		
		admin.setNome_admin("Wilson");
		admin.setLogin_admin("Will");
		admin.setSenha_admin("123");

		AdministradorDAO adminDao = new AdministradorDAO();
		
		adminDao.cadastrar(admin);
	}

	public static void testAlterar(){
		
		Administrador admin = new Administrador();
		
		admin.setId_admin(1);
		admin.setNome_admin("xxxxxxxxxxxxx");
		admin.setLogin_admin("xxxxxxxxxxxx");
		admin.setSenha_admin("xxxxxxxxxxxx");
		
		AdministradorDAO adminDao = new AdministradorDAO();
		
		adminDao.alterar(admin);
	}
	
	public static void testExcluir(){
		
		Administrador admin = new Administrador();
		
		admin.setId_admin(1);
		
		AdministradorDAO adminDao = new AdministradorDAO();
		
		adminDao.excluir(admin);
	}
		
	public static void TestBuscarTodos(){
		
		AdministradorDAO adminDao = new AdministradorDAO();
		
		List<Administrador> listaResultado = adminDao.buscarTodos();

		for (Administrador administrador : listaResultado) {
			
			System.out.println(administrador.getNome_admin() +"  "+ 
							   administrador.getLogin_admin()+"  "+
							   administrador.getId_admin()   +"  "+
							   administrador.getSenha_admin());
		}
	
	}
	
	
	
}
