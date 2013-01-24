<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pick Assignment</title>
</head>
<body>
	<div align="center">
		<jsp:include page="/AssignmentsViewServlet" />
		
		<h2>Pick Assignment for your project:</h2>
		
		<table id="tableID" border="0" align="center">
		<form action="AsignProjectAssignmentServlet" method="POST">
			<tr><td align="right">ProjectID:</td><td><input type="text" size="67" name="ProjectID"></td></tr>
			<tr><td align="right">Select Assignment for your project(input Project Assignment id):</td><td><input type="text" size="67" name="ProjectAssignmentId"></td></tr>
			<tr><td align="right"><input type="submit" value="Pick!" /></td></tr>
		</form>
		</table>
		
	</div>
</body>
</html>