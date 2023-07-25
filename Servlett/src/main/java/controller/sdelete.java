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

@WebServlet("/delete")
public class sdelete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		String id=req.getParameter("id");
	    int cid=Integer.parseInt(id);
	    
	    d d1=new d();
	    d1.deleted(cid);
	    
	    List<dd> l2=d1.fetchall();;
		req.setAttribute("studentlist", l2);
		
		resp.getWriter().print("<h1>Data deleted successfully</h1>");
		RequestDispatcher ggg=req.getRequestDispatcher("hi.jsp");
		ggg.include(req, resp);
	} 
}
