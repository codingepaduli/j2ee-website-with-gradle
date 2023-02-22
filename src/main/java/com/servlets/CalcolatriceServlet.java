package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CalcolatriceServlet
 */
@WebServlet("/calcolatrice")
public class CalcolatriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("calcolatrice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1S = (String) request.getParameter("num1");
		String num2S = (String) request.getParameter("num2");
		
		double num1 = Double.parseDouble(num1S);
		double num2 = Double.parseDouble(num2S);
		double somma = num1 + num2;

		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("somma", somma);
		request.getRequestDispatcher("risultato.jsp").forward(request, response);
	}

}
