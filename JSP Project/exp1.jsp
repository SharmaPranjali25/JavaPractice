<%@page import= "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tags</title>
</head>
<body>
<!--  Decalaration Tag -->
<!-- java code variables are here -->
<%!

int x=10; 
int y=20; 
public int add(){ 
	 return x+y; 

    }
%>

<!-- Expression Tag -->
<%= add() %>

<!--  Scriplet Tag -->
<br> <br>
<%
out.println("Scriplet tag: "+ add());
out.println("<br><br> Curent System Date: "+ new Date());

%>



</body>
</html>