<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main : Maple Mannequin</title>
<jsp:include page="inc/link.jsp"></jsp:include>
<jsp:include page="inc/script.jsp"></jsp:include>
<script type="text/javascript">
 	$(document).ready(function() {
		$('#change').click(function(){
			$.ajax({
				url:'${pageContext.request.contextPath }/getImg',
				data:{"itemId":$('#itemId').val(),
					"equipName":$('#equipName').val()
					},
				success:function(rdata){
					$('#imgDiv').html(imgSrc(rdata));
				}
			});
		});
 	});
 </script>


</head>
<body>
<h1>${sessionScope.id }</h1>
<div class="col-sm-6">
 <c:if test="${!empty sessionScope.id }">
  <a href="${pageContext.request.contextPath }/logout" class="btn btn-lg red">Logout</a>
  <a href="${pageContext.request.contextPath }/myMannequin" class="btn btn-lg red">My Mannequin</a>
 </c:if>
 <c:if test="${empty sessionScope.id }">
  <a href="${pageContext.request.contextPath }/login" class="btn btn-lg red">Sign in</a>
  <a href="${pageContext.request.contextPath }/signup" class="btn btn-lg red">Sign up</a>
 </c:if>
 <a href="${pageContext.request.contextPath }/simulator" class="btn btn-lg red">simulator</a>
 
</div>

<h1>Maple Mannequin</h1>
<h1>${src }</h1>
<%-- <c:forEach var="mList" items="${mList }"> --%>
<!--  <div class="col mb-5"> -->
<%--   <img src="${mList }" alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;"> --%>
<!--  </div> -->
<%-- </c:forEach> --%>

<div id="imgDiv" class="col-sm-3">
</div>
<input id="equipName" name="equipName" type="text" placeholder="eq">
<input id="itemId" name="itemId" type="text" placeholder="cod">
<button id="change" class="btn btn-lg red">모자</button>

</body>
</html>