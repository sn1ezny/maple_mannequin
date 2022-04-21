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
				data:{"itemId":$('#itemId').val()},
				success:function(rdata){
					$('#imgDiv').html(imgSrc(rdata));
				}
			});
		});
 	});
 </script>


</head>
<body>

<div class="col-sm-3">
 <a href="${pageContext.request.contextPath }/login" class="btn btn-lg red">Sign in</a>
 <a href="${pageContext.request.contextPath }/signup" class="btn btn-lg red">Sign up</a>
</div>

<h1>Maple Mannequin</h1>

<c:forEach var="mList" items="${mList }">
 <div class="col mb-5">
  <img src="${mList } alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
 </div>
</c:forEach>

<div id="imgDiv" class="col-sm-3">
</div>
<input id="itemId" name="itemId" type="text">
<button id="change" class="btn btn-lg red">모자</button>


<div class="demo">
        <div class="container">
            <div class="row text-center">
                <h1 class="heading-title"> Buttons Style </h1>
            </div>

            <div class="row pad-15">
                <div class="col-sm-3">
                    <a href="#" class="btn btn-lg red">Download</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-lg blue">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-lg orange">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-lg green">Button</a>
                </div>
            </div>

            <div class="row pad-15">
                <div class="col-sm-3">
                    <a href="#" class="btn btn-sm red">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-sm blue">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-sm orange">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-sm green">Button</a>
                </div>
            </div>

            <div class="row pad-15">
                <div class="col-sm-3">
                    <a href="#" class="btn btn-xs red">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-xs blue">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-xs orange">Button</a>
                </div>

                <div class="col-sm-3">
                    <a href="#" class="btn btn-xs green">Button</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>