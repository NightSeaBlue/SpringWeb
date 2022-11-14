<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp for Dept</title>
</head>
<body>

<table border='2'>
	<c:forEach items='${result}' var='HashMap'>
		<tr>

			<td>${HashMap.ENAME}</td>
			<td>${HashMap.EMPNO}</td>
			<td>${HashMap.DNAME}</td>

		</tr>
		
	</c:forEach>
</table>

</body>
</html>