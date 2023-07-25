package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.d;
import dto.dd;

@WebServlet("/upp")
public class uppppp extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	super.doGet(req, resp);
	String id= req.getParameter("sid");
	int cidd=Integer.parseInt(id);
	String name=req.getParameter("sname");
	String phno=req.getParameter("phno");
	long cnum=Long.parseLong(phno);
	String gender=req.getParameter("gender");
	
	dd d2= new dd();
	d2.setSid(cidd);
	d2.setSname(name);
	d2.setPhno(cnum);
	d2.setGender(gender);
	
	d ddd= new d();
	ddd.uppp(d2);
	
	List<dd> l1=ddd.fetchall();;
	req.setAttribute("studentlist", l1);
	
	resp.setContentType("text/html");
	resp.getWriter().print("<h3>Data Updated successfully</h3>");
	RequestDispatcher gg=req.getRequestDispatcher("hi.jsp");
	gg.include(req, resp);
	
	
}
}
