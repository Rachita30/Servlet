package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.d;
import dto.dd;

@WebServlet("/insert")
public class c extends GenericServlet {


	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String sid=arg0.getParameter("sid");
		 int id=Integer.parseInt(sid);
		String sname=arg0.getParameter("sname");

		String gender=arg0.getParameter("gender");
		String phno=arg0.getParameter("phno");
		
		long num=Long.parseLong(phno);
		
		dd a= new dd();
		a.setSid(id);
		a.setSname(sname);
		a.setPhno(num);
		a.setGender(gender);
		
		d b= new d();
//		b.create(a);
		
	}

}
