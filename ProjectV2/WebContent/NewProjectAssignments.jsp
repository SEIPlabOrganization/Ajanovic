<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Create New Assignment</title>
</head>
<body>

	
	<h1>Create New Assignments</h1>
	
	<table border="0" align="center">
		<form action="CreateAssignServlet" method="POST">
			<tr><td align="right">Proposer Name:</td><td><input type="text" size="67" name="ImeAutoraZadatka"></td></tr>
			<tr><td align="right">Proposal Name:</td><td><input type="text" size="67" name="ImeZadatka"></td></tr>
			<tr><td align="right">Assignment Description:</td><td><textarea rows="4" cols="50" name="DescriptionZadatka"></textarea></td></tr>
			<tr><td align="right">Preparation for assignment and suggested readings:</td><td><textarea rows="4" cols="50" name="DescriptionZadatkaZaPripremu"></textarea></td></tr>
			<tr><td align="right">Project ID:</td><td><input type="text" size="67" name="idProject" /></td></tr>
			<tr><td align="right"><input type="submit" value="Create!" /></td></tr>
		</form>
	</table>
	
	<a href="Pocetna.html">Povratak na pocetnu...</a>
</body>
</html>