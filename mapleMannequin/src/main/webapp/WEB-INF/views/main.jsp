<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main : Maple Mannequin</title>
<jsp:include page="inc/link.jsp"></jsp:include>
</head>
<body>

<div class="col-sm-3">
 <a href="${pageContext.request.contextPath }/login" class="btn btn-lg red">Sign in</a>
 <a href="${pageContext.request.contextPath }/signup" class="btn btn-lg red">Sign up</a>
</div>

<h1>Maple Mannequin</h1>

<img src="https://maplestory.io/api/character/%7B%22itemId%22%3A2000%2C%22version%22%3A%22231%22%7D%2C%7B%22itemId%22%3A12000%2C%22version%22%3A%22231%22%7D%2C%7B%22itemId%22%3A1012215%2C%22animationName%22%3A%22default%22%2C%22version%22%3A%22231%22%7D/stand1/0?showears=false&amp;showLefEars=false&amp;showHighLefEars=undefined&amp;resize=1&amp;name=&amp;flipX=false&amp;bgColor=0,0,0,0" alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
<img src="https://maplestory.io/api/character/%7B%22itemId%22%3A2000%2C%22region%22%3A%22KMS%22%2C%22version%22%3A%22362%22%7D%2C%7B%22itemId%22%3A12000%2C%22region%22%3A%22KMS%22%2C%22version%22%3A%22362%22%7D/stand1/0?showears=false&amp;showLefEars=false&amp;showHighLefEars=undefined&amp;resize=1&amp;name=&amp;flipX=undefined" alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
<img src="https://maplestory.io/api/character/%7B%22itemId%22%3A2018%2C%22region%22%3A%22KMS%22%2C%22version%22%3A%22362%22%7D%2C%7B%22itemId%22%3A12018%2C%22region%22%3A%22KMS%22%2C%22version%22%3A%22362%22%7D/stand1/0?showears=false&amp;showLefEars=false&amp;showHighLefEars=undefined&amp;resize=1&amp;name=&amp;flipX=undefined" alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
<img src="${manne } alt="" class="renderable-instance" draggable="false" style="position: relative; touch-action: none;">
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