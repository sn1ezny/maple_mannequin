<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Mannequin : Maple Mannequin</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1>${sessionScope.name }님의 마네킹 리스트</h1>


<%-- <c:forEach var="mList" items="${mList }"> --%>
<!--  <div class="col mb-5"> -->
<%--   <img src="${mList }" alt="img" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;"> --%>
<!--  </div> -->
<%-- </c:forEach> --%>



 <section class="py-5">
    <div class="container px-4 px-lg-5 mt-5">
        <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
        
        <c:forEach var="mList" items="${mList }">
        	<div class="col mb-5">
			    <div class="card h-100">
			        <div class="card-body p-4">
			        <div class="center">
			        <img src="${mList }" alt="img" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
			        </div>
			            <div class="text-center">
			                <!-- Product name-->
			                <h5 class="fw-bolder">Mannequin Name</h5>
			                <!-- Product price-->
			                ${sessionScope.name }
			            </div>
			        </div>
			        <!-- Product actions-->
			        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
			        </div>
			    </div>
			</div>
        </c:forEach>
        
        </div>
    </div>
 </section>


</body>
</html>