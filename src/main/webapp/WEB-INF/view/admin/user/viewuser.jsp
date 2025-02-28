<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="vi">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Danh sách người dùng</title>
            <style>
                /* Cài đặt font cho toàn bộ trang */
                * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }

                body {
                    background-color: #f4f7fc;
                    padding: 20px;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    min-height: 100vh;
                }

                /* Tạo tiêu đề cho trang */
                h2 {
                    color: #333;
                    font-size: 2rem;
                    text-align: center;
                    margin-bottom: 20px;
                }

                /* Nút tạo người dùng mới */
                .btn-create {
                    background-color: #5c6bc0;
                    color: white;
                    padding: 12px 25px;
                    text-decoration: none;
                    display: inline-block;
                    margin-bottom: 20px;
                    border-radius: 5px;
                    transition: background-color 0.3s ease-in-out;
                }

                .btn-create:hover {
                    background-color: #3f51b5;
                }

                /* Bảng người dùng */
                table {
                    width: 100%;
                    max-width: 1000px;
                    margin: 0 auto;
                    border-collapse: collapse;
                    border-radius: 8px;
                    overflow: hidden;
                    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
                    background-color: white;
                }

                th,
                td {
                    padding: 12px 15px;
                    text-align: left;
                    font-size: 1rem;
                    border-bottom: 1px solid #ddd;
                }

                th {
                    background-color: #3f51b5;
                    color: white;
                }

                tr:nth-child(even) {
                    background-color: #f9f9f9;
                }

                tr:hover {
                    background-color: #f1f1f1;
                }

                /* Cải thiện các nút trong bảng */
                .btn {
                    padding: 8px 15px;
                    font-size: 14px;
                    border-radius: 4px;
                    color: white;
                    border: none;
                    cursor: pointer;
                    transition: background-color 0.3s ease;
                }

                .btn-update {
                    background-color: #ff9800;
                }

                .btn-update:hover {
                    background-color: #e68900;
                }

                .btn-delete {
                    background-color: #f44336;
                }

                .btn-delete:hover {
                    background-color: #d32f2f;
                }

                /* Nút xoá */
                .delete-form {
                    display: inline-block;
                }

                /* Cải tiến khoảng cách của các thẻ */
                td a {
                    margin-right: 10px;
                }
            </style>
        </head>

        <body>
            <div>
                <h2>Danh sách người dùng</h2>

                <!-- Nút tạo người dùng mới -->
                <a href="/admin/user" class="btn-create">Tạo Người Dùng Mới</a>

                <c:if test="${empty users}">
                    <p>Không có người dùng nào trong hệ thống.</p>
                </c:if>

                <c:if test="${not empty users}">
                    <table>
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Tên</th>
                                <th>Địa chỉ</th>
                                <th>Hành động</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="user" items="${users}">
                                <tr>
                                    <td>${user.id}</td>
                                    <td>${user.name}</td>
                                    <td>${user.location}</td>
                                    <td>
                                        <!-- Nút Xem -->
                                        <a href="/admin/user/show/${user.id}" class="btn btn-update">Xem</a>

                                        <!-- Nút Cập nhật -->
                                        <a href="/admin/user/update/${user.id}" class="btn btn-update">Cập Nhật</a>

                                        <!-- Nút Xóa -->
                                        <form action="<c:url value='/admin/user/delete/${user.id}' />" method="POST"
                                            class="delete-form">
                                            <button type="submit" class="btn btn-delete">Xóa Người Dùng</button>
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>
        </body>

        </html>