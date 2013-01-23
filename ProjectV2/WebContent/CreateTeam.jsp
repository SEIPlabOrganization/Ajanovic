<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Team</title>
	<script>
	
	function clear();
	
	
	</script>
</head>
<body>

	<script  type="text/javascript">
		tmp;
		temp=1;
	</script>
	
	<h1>Create new team and new project:</h1>
	<table id="tableID" border="0" align="center">
	
<div id="idDiv">	
	<form action="CreateTeamServlet" method="POST">
	
		<tr><td>Team name:</td><td><input type="text" size="67" name="TeamName"></td></tr>
		<tr><td>Team Leader JMBAG:</td><td><input type="text" size="67" name="JMBAGTeamLeader" /></td></tr>
		
		<tr><td>Project name:</td><td><input type="text" size="67" name="ProjectName" /></td></tr>
		
		<tr><td>Member Responsibility:</td><td><jsp:include page="/ResponsibilitiesServlet" /></td></tr>
		<tr><td>Member JMBAG:</td><td><input type="text" size="67" name="JMBAGMember" /></td></tr>
		
		
		
	</table>
		<input type="submit" value="Create!" />		
	</form>
</div>

</body>
</html>