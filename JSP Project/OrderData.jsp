<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Data</title>
</head>
<body>
<jsp:useBean id="obj" class="com.test.Order"> </jsp:useBean>
 <!-- Java object creation -->
<!-- Bean is Object -->
<!--

<jsp:setProperty property="id" name="obj"/> 
<jsp:setProperty property="name" name="obj"/> 
<jsp:setProperty property="descp" name="obj"/> 
<jsp:setProperty property="qnt" name="obj"/> 

  --> 
  <jsp:setProperty property="*" name="obj"/> 



<jsp:getProperty property="id" name="obj"/>
<jsp:getProperty property="name" name="obj"/>
<jsp:getProperty property="descp" name="obj"/>
<jsp:getProperty property="qnt" name="obj"/>

 
 <jsp:include page="home.jsp"></jsp:include>

</body>
</html>