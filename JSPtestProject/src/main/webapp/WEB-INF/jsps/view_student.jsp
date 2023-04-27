<%@page import="com.masai.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List Page</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<% List<Student> list = (List<Student>)request.getAttribute("studentList"); %>
	
	<fieldset>
		<legend><strong><big>Student List</big></strong></legend>
		<table width="100%" border="1" cellpadding="4" cellspacing="4">
			<tr>
				<th align="left">Roll No</th>
				<th align="left">Name</th>
				<th align="right">Mark</th>
			</tr>
			
			<% for (Student s : list){
			%>
			<tr>
				<th align="left"><%= s.getRoll() %></th>
				<th align="left"><%= s.getName() %></th>
				<th align="right"><%= s.getMarks() %></th>
			</tr>
			<%
			} %>
			
		</table>
	</fieldset>
</body>
</html>