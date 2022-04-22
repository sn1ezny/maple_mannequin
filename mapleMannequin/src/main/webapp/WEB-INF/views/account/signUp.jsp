<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up : Maple Mannequin</title>
<jsp:include page="../inc/link.jsp"></jsp:include>
<jsp:include page="../inc/script.jsp"></jsp:include>
</head>
<body>
<h1>회원가입 페이지</h1>
<form action="${pageContext.request.contextPath }/signUpTry" method="post">
 <label>아이디</label>
 <input type="text" name="account" placeholder="account"><br>
 <label>비밀번호</label>
 <input type="password" name="password" placeholder="pw"><br>
 <label>이름</label>
 <input type="text" name="name" placeholder="name"><br>
 <button class="btn btn-lg red" type="submit">Submit</button>
</form>
</body>
</html>