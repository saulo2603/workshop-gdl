<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title></title>
	</head>

	<body>
		<h1>We found your book!. The book name is <s:property value="bookResultTitle"/> 
			with author name <s:property value="bookResultAuthor"/> </h1>
		<p><a href="<s:url action='index'/>">Go Back...</a></p>
	</body>
</html>