package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import dao.d;
import dto.dd;
import net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher;
@WebServlet("/fetchall")
public class fetchall extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		d d1=new d();
		List<dd> l=d1.fetchall();
		req.setAttribute("studentlist", l);
		RequestDispatcher d=req.getRequestDispatcher("hi.jsp");
		d.forward(req, resp);
	}
	
}