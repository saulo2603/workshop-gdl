<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Book Store</title>
	</head>

	<body>

		<h1>Hey!</h1>
		<p>Now, you can query for a book!.</p>
		
		<!-- This will create a simple form to search books in our fake DB (Book class) -->
		<s:form action="books">
			<s:textfield name="bookQuery" label="Write a book name here "/>
			<s:submit value="Submit"/>
		</s:form>
	
	</body>
</html>