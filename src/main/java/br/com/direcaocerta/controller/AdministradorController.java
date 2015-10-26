package br.com.direcaocerta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "/administradorController.do")
public class AdministradorController extends HttpServlet {

	/**
	 * 
	 */
	
	public AdministradorController() {
		System.out.println("Novo Servlet");
	}

	/**
	 * 
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Chamou!");
		super.doGet(req, resp);
	}
}
