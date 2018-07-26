package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Tarefa;


public class Logout implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		 HttpSession session = request.getSession();
		    session.removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}
}