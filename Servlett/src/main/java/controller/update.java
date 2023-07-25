package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.d;
import dto.dd;

@WebServlet("/update")
public class update extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String sid=arg0.getParameter("sid");
		 int id=Integer.parseInt(sid);
		String phno=arg0.getParameter("phno");
		long num=Long.parseLong(phno);		
		
		d u= new d();
		u.update(id, num);
		
		dd uu= new dd();
	}

}
