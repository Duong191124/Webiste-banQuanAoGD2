<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h3>Danh sách sản phẩm chi tiết</h3>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên sản phẩm</th>
                <th>Tên màu sắc</th>
                <th>Tên kích thước</th>
                <th>Mã sản phẩm chi tiết</th>
                <th>Số lượng</th>
                <th>Đơn giá</th>
                <th>Trạng thái</th>
                <th>Thao tác</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${data.content}" var="productdetail">
                <tr>
                    <td>${productdetail.id}</td>
                    <td>${productdetail.sp.ten}</td>
                    <td>${productdetail.ms.ten}</td>
                    <td>${productdetail.kt.ten}</td>
                    <td>${productdetail.maSPCT}</td>
                    <td>${productdetail.soLuong}</td>
                    <td>${productdetail.donGia}</td>
                    <td>${productdetail.trangThai}</td>
                    <td>
                        <a href="#">Update</a>
                        <a href="#">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>