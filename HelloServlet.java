package web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class HelloServlet extends HttpServlet{

	public void service(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException{

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<h1>Hello World </h1>");
		out.close();
	}

}
select _id,_username,_password from student"