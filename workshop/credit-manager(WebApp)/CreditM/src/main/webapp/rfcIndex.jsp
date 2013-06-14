<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Credit Manager</title>
</head>
<body>

		<h1>Searching for a credit?</h1>
		<p>Insert your RFC here.</p>
		
		<!-- This will create a simple form to search books in our fake DB (Book class) -->
		<s:form action="loanForm">
			<s:textfield name="rfcQuery" label="Write your RFC"/>
			<s:select label="Operations" name="operations" value="-1" 
			list="#{'1':'Close Loan',
				  '2':'Payment',
				  '3':'Get New Loan',
				  '4':'Display'}"/>
			
			<s:submit value="Submit"/>								
		</s:form>
	
	</body>
</html>