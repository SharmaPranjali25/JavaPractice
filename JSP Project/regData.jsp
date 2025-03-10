<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.DriverManager" %>
    <%@ page import="java.sql.Connection" %>
    <%@ page import="java.sql.PreparedStatement" %>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Regdata is Here</title>
</head>
<body>

<!-- Scriplet Tag -->
<%
try{
	Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root", "root@39");
String sql = "insert into user_mla (mla_fname, mla_user, mla_pass)values(?,?,?)";
PreparedStatement pst= con.prepareStatement(sql);

String fname= request.getParameter("fname");
String user= request.getParameter("user");
String pass= request.getParameter("pwd");

pst.setString(1,fname);
pst.setString(2,user);
pst.setString(3,pass);

pst.execute();

out.println("Store User Data");
}
catch(Exception e){
	e.printStackTrace();
}

%>
</body>
</html>