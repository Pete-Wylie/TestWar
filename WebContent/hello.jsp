<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pete.webapps.MySupportClass"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h1>Testing CI Build Deployment</h1>
This page shows the WAR file running on the server

<% 
	MySupportClass mySupport = new MySupportClass();

	out.println(mySupport.myTest());

%>
</body>
</html>