<%@page import="dto.dd"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<dd> l1=(List<dd>) request.getAttribute("studentlist"); %>

<table border="1px solid black">
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Gender</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%for(dd a:l1) {%>
<tr>
<td><%=a.getSid()%></td>
<td><%=a.getSname()%></td>
<td><%=a.getPhno()%></td>
<td><%=a.getGender()%></td>
<td><a href="delete?id=<%=a.getSid()%>">delete</a></td>
<td><a href="update.jsp?&sid=<%=a.getSid()%>
                        &sname=<%=a.getSname()%>
                        &phno=<%=a.getPhno()%>
                        &gender=<%=a.getGender()%>">
                        update</a></td>
</tr>
<%}%>
</table>
</body>
</html>