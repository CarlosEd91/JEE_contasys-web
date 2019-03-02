package com.hogam.contasys.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(description = "Clase para procesar la informacion de credenciales", urlPatterns = { "/abc123" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 1. Establecer el tipo de contenido a mostrar
				response.setContentType("text/html");

				// recuperacion de los valores
				String nombreUsuario = request.getParameter("txtUsuario");

				// Setear un parametro en sesion
				// recuperar el objeto HttpSession
				HttpSession sesion = request.getSession();
				// setear el valor
				sesion.setAttribute("empresa", "hogam");

				// setear un parametro de la aplicacion
				getServletContext().setAttribute("url", "www.hogam.com");

				if (!nombreUsuario.equals("") && !nombreUsuario.equals("carlos")) {

					// 2. Recuperar el escritor
					PrintWriter escritor = response.getWriter();

					// 3. General el contenido dinamico
					escritor.println("<html><body><h3>Bienvenido</h3>"
							+ "<br> Sistema contable</body></html>");
					escritor.println("Datos de ingreso: " + nombreUsuario);

					// 4. Cerrar el escritor
					escritor.close();

					sesion.setAttribute("usuario", "carlos");
				} else if (nombreUsuario.equals("carlos")) {
			response.sendRedirect("mbn234?codigoError=105");
				} else {
					response.sendRedirect("mbn234?codigoError=106");

				}

				// // remover un valor de session
				 sesion.removeAttribute("empresa");
				// // cerrar sesion
				 //sesion.invalidate();		
	}

}
