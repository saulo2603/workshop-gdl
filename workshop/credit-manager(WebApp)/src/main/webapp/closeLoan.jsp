<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Close Loan Form</title>
	</head>
	
	<body>
			<s:form action="updateLoans">
			<!-- <h1><s:property value="rfcResult"/> </h1> -->
			<table border="1" align="center" bgcolor="lightblue">
			<thead ><tr><th colspan="10" bgcolor="blue"><h1>Close Loan</h1></th></tr></thead>
				<tr align="center"><td></td><td>Bank Code</td><td>RFC</td><td>Costumer Name</td><td>Country</td><td>Amount</td><td>Date</td><td>Calification</td><td>Active</td><td>ID</td></tr>
				<s:iterator value="rfcSplit1">					
			 		<tr  bgcolor="#a1bafd" align="center">
			 			<td align="center">
			 				<input type="radio" name="id" value="<s:property value="#rfcSplit1[8]"/>">
			 			</td>
			 			<s:iterator value="top">
							<td><s:property/></td>
						</s:iterator>			 		
			 		</tr>			 		
				</s:iterator>
				<tr>
			 		<!-- <td colspan="10" width="150px" align="center"><a href="<s:url action='updateLoans'/>"><button name="CloseLoanBtn">Close selected Loan</button></a></td> -->
			 		<td colspan="10" width="150px" align="center"><s:submit value="Submit"/></td>	
			 	</tr>				
			</table>
			</s:form>	
			<p align="center"><a href="<s:url action='rfcIndex'/>"><button value="Back">Back</button></a></p>
															
			<!-- <p align="center"><a href="<s:url action='rfcIndex'/>">Go Back...</a></p> -->
	</body>
</html>