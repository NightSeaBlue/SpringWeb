<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- jstl -->
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다중입력 수행 결과</title>
</head>
<body>
	결과는 뚜둔?!
	<hr>

	<h3>멤버 리스트</h3>
	<table border='2'>
		<tr>
			<th>이름</th>	<th>아이디</th><th>나이</th>
		</tr>
		<!-- for(변수 지정 :집합 변수) -->
		<c:forEach var='vo' items="${memberVOList.list}">
		<c:if test="${vo.state}">
			<tr>
				<td>${vo.name}</td>
				<td>${vo.id}</td>
				<td>${vo.age}</td>
			</tr>
		</c:if>
		</c:forEach>
	</table>

</body>
</html>