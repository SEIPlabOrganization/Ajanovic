<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Project</title>
</head>
<body>
	<h1>Create New Project:</h1>
		<table id="tableID" border="0" align="center">
		
	
		<form action="NewProjectServlet" method="POST">
		
			<tr><td align="right">Project name:</td><td><input type="text" size="67" name="ProjectName"></td></tr>
			<tr><td align="right">Project Description:</td><td><textarea rows="4" cols="50" name="ProjectDescription"></textarea></td></tr>
			<tr><td align="right">Project start date(format: yyyy-mm-dd)</td><td><input type="text" size="67" name="DateBegin"></td></tr>
			<tr><td align="right">Project end date(format: yyyy-mm-dd)</td><td><input type="text" size="67" name="DateEnd"></td></tr>
			<tr><td align="right">Subject</td><td><input type="text" size="67" value="Software Engineering" name="Subject"></td></tr>
			
			
			<tr><td align="right"><input type="submit" value="Create!" /></td></tr>
		
			
		</table>
		</form>
		
	
</body>
</html>