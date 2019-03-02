package com.hogam.contasys.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class ServletError
 */
@WebServlet(description = "Errores personalizados", urlPatterns = { "/mbn234" })
public class ServletError extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public ServletError() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {

		String codigoError = request.getParameter("codigoError");

		if (codigoError.equals("106")) {
			response.setContentType("text/html");
			response.getWriter().println("Se deben ingresar todos los campos");
		} else if (codigoError.equals("105")) {
			response.setContentType("text/html");
			HttpServletRequest requestHttp = (HttpServletRequest) request;
			response.getWriter().println(
					"Usuario no tiene permisos para la empresa"
							+ requestHttp.getSession().getAttribute("empresa")
							+ " mayor informacion en: "
							+ getServletContext().getAttribute("url"));
		} else {
			request.getRequestDispatcher("./inicio.html").forward(request,
					response);

		}

	}
}
