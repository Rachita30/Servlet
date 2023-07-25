package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.d;
@WebServlet("/fetch")
public class fetch extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		 String sid=arg0.getParameter("sid");
         int oo=Integer.parseInt(sid);
         
       d f= new d();
         String msg= f.fetch(oo);
         arg1.getWriter().print(msg);
         	
         
		
	}

}
