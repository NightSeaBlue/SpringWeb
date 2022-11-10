<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 실행 결과</title>
</head>
<body>

request.do 실행결과 <hr>

아이디 : ${param.id} <br>
이름 : ${param.name} <br>
나이 : ${param.age} <br>

<hr>

아이디 : ${memberVO.id} <br>
이름 : ${memberVO.name} <br>
나이 : ${memberVO.age} <br>

<hr>

</body>
</html>