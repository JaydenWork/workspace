<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>주문 페이지</title>
</head>
<body>
    <h2>주문 페이지</h2>
    <form action="/orderProduct.do" method="post">
        <table border="1">
            <tr>
                <th colspan="3">주문자명</th>
            </tr>
            <tr>
                <td colspan="3">이름: <input type="text" name="name"></td>
            </tr>
            <tr>
                <td>품목</td>
                <td>가격</td>
                <td>수량</td>
            </tr>
            <tr>
                <td>검정 펜</td>
                <td>500원</td>
                <td><input type="number" name="blackPen" value="0" min="0" max="100"></td>
            </tr>
            <tr>
                <td>빨간 펜</td>
                <td>700원</td>
                <td><input type="number" name="redPen" value="0" min="0" max="100"></td>
            </tr>
            <tr>
                <td>파란 펜</td>
                <td>700원</td>
                <td><input type="number" name="bluePen" value="0" min="0" max="100"></td>
            </tr>
            <tr>
                <td>화이트</td>
                <td>1000원</td>
                <td><input type="number" name="white" value="0" min="0" max="100"></td>
            </tr>
            <tr>
                <td colspan="3"><button type="submit">구매</button><button type="reset">초기화</button></td>
            </tr>
        </table>
        </form>
</body>
</html>
