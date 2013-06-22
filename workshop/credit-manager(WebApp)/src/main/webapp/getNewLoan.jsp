<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register new Loan</title>
</head>
<body>				
	<div align="center" style="border: 1px solid; margin-left: 40%; margin-right: 40%; background-color: lightblue;">
	<h1>Get New Loan</h1>
	<s:form action="newLoan">
		  <s:set name="rfcVar" value="rfcQuery"/>
	 	  <s:textfield name="newRfc" id="rfcTxt" label="RFC" readonly="true" value="%{#rfcVar}"/>
	 	  <s:textfield  name="newName" label="Name" />
	 	  <s:textfield name="newLastName"  label ="Last Name"/>  
	 	  <s:textfield name="newSalary"  label="Salary"  />
	 	  <s:textfield name="newAmount"  label="Amount"  />	 
	 	  
	 	  <s:select label="Bank" name="newBankCode" headerKey="-1" headerValue="Options" 
	 	  list="#{					  
					  '100':'Banamex',
					  '101':'BBVA Bancomer',
					  '102':'Santander',
					  '103':'HSBC'}"/>	  
   	 <s:submit value="Register"/>
   	</s:form>
   	</div>

</body>
</html>