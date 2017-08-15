<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring page Redirection</title>
</head>
<body>
	<h2>Spring page Redirection</h2>

	<p>Click below button to redirect the result to new page</p>
	<%-- <form:form method="GET" action="/springs/redirect"> --%>
	<form:form method="GET" action="/springs/staticPage">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML page"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>