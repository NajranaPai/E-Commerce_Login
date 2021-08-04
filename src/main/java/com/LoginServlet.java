package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email=request.getParameter("email");
		 String pwd=request.getParameter("pwd");
		 HttpSession session=request.getSession();
		 
		 PrintWriter out=response.getWriter();
		 response.setContentType("Text/Html");
		 if(email.equalsIgnoreCase("painaaz@yahoo.in") && pwd.equals("nazranapai"))
		 {
			 session.setAttribute("email", email);
			 response.sendRedirect("HomepageServlet");
		 }
		 else
		 {
			 request.getRequestDispatcher("login.html").include(request, response);
			 out.println("<body> <span style='color:red'>" + "<b>Enter Valid email or Password..</b>" + "</Span></body>");
			 
		 }
	}

}
