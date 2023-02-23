package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Servlet implementation class CalcolatriceServlet
 */
@WebServlet("/calcolatrice")
public class CalcolatriceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	static Logger logger = Logger.getLogger(CalcolatriceServlet.class);    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("Calcolatrice");
		request.getRequestDispatcher("calcolatrice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String num1S = (String) request.getParameter("num1");
		String num2S = (String) request.getParameter("num2");
        String formato = (String) request.getParameter("formato");
		
        logger.debug("Vista " + formato + " - " + num1S + " + " + num2S);
		
		double num1 = Double.parseDouble(num1S);
		double num2 = Double.parseDouble(num2S);
		double somma = num1 + num2;

		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("somma", somma);
        
        if (formato != null && formato.equals("XML")) {
            request.getRequestDispatcher("risultatoXML.jsp").forward(request, response);
        }
        if (formato != null && formato.equals("JSON")) {
            request.getRequestDispatcher("risultatoJSON.jsp").forward(request, response);
        }
        if (formato == null || formato.equals("HTML")) {
            request.getRequestDispatcher("risultato.jsp").forward(request, response);
        }
	}

}
