package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomepaeServlet
 */
public class HomepageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomepageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("Text/Html");
	  PrintWriter out =response.getWriter();
	  HttpSession session=request.getSession();
	  String email=null;
		 if(session!=null || session.getAttribute("email")!=null)
		 {
			 email=(String) session.getAttribute("email");
		 }
	  out.print("<html><head></head>");
	  out.println("<body><div class= center> Welcome : " + email + "\n");
	  out.println("\n <a href=logout>Logout</a>");
	  out.println("</div></body>");
	}
}
