<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updateeee</title>
</head>
<body>
<form action="upp">
Id:<input type="number" name="sid" value=<%=request.getParameter("sid") %> readonly="readonly"><br>
name:<input type="text" name="sname" value=<%=request.getParameter("sname") %>><br>
Contact:<input type="number" name="phno" value=<%=request.getParameter("phno") %>><br>
Gender:<br>
<%if(request.getParameter("gender").equals("male")) {%>
Male:<input type="radio" name="gender" value="male"> <br>
Female:<input type="radio" name="gender" value="female" checked="checked"><br>
<%} else{%>
Male:<input type="radio" name="gender" value="male"> <br>
Female:<input type="radio" name="gender" value="female" checked="checked"><br>
<%} %>

<button type="submit">Update</button>
</form>
</body>
</html>