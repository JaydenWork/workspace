<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>결과 페이지</title>
</head>
<body>

    <% String name = request.getParameter("name"); %>
    <% int blackPen = Integer.parseInt(request.getParameter("blackPen")); %>
    <% int redPen = Integer.parseInt(request.getParameter("redPen")); %>
    <% int bluePen = Integer.parseInt(request.getParameter("bluePen")); %>
    <% int white = Integer.parseInt(request.getParameter("white")); %>

    <% int blackPrice = 500; %>
    <% int redPrice = 700; %>
    <% int bluePrice = 700; %>
    <% int whitePrice = 1000; %>
    <% int totalPrice = (blackPrice * blackPen) + (redPrice * redPen) + (bluePrice * bluePen) + (whitePrice * white); %>


    <h1><%= name %>님의 구매 목록</h1>
			검정 펜<%= blackPen %>개 : <%= (blackPrice * blackPen)%>원</br>
			빨간 펜<%= redPen %>개 : <%= (redPrice * redPen)%>원</br>
			파란 펜<%= bluePen %>개 : <%= (bluePrice * bluePen)%>원</br>
			화이트 <%= white %>개 : <%= (whitePrice * white)%>원</br>
  
    <%-- 총 가격 출력 --%>
    <h3>총합 : <%= totalPrice %>원을 결제하셨습니다.</h3>
</body>
</html>
