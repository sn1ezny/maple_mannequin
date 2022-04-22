<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>내 마네킹 리스트 페이지</h1>

<%-- <img src="${manne1 }" alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;"> --%>

<c:forEach var="mList" items="${mList }">
 <div class="col mb-5">
  <img src="${mList }" alt="img" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
 </div>
</c:forEach>

</body>
</html>