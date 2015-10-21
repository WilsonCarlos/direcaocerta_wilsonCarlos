package br.com.direcaocerta.entidades;

public class Administrador {

	private Integer id_admin;
	private String nome_admin;
	private String login_admin;
	private String senha_admin;
	
	public Integer getId_admin() {
		return id_admin;
	}
	public void setId_admin(Integer id_admin) {
		this.id_admin = id_admin;
	}
	public String getNome_admin() {
		return nome_admin;
	}
	public void setNome_admin(String nome_admin) {
		this.nome_admin = nome_admin;
	}
	public String getLogin_admin() {
		return login_admin;
	}
	public void setLogin_admin(String login_admin) {
		this.login_admin = login_admin;
	}
	public String getSenha_admin() {
		return senha_admin;
	}
	public void setSenha_admin(String senha_admin) {
		this.senha_admin = senha_admin;
	}
	
}
