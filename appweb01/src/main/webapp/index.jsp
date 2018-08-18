<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Servlet-JSP</title>
</head>
<body>

	<form name="bmiForm" action="StudentController" method="POST">

		<table>
			<tr>
				<td>Id :</td>
				<td><input type="text" name="id" /></td>
			</tr>

			<input type="submit" value="Submit" name="Send" />

		</table>

	</form>

</body>
</html>