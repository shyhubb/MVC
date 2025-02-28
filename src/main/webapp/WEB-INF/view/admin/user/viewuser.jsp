<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="vi">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Danh sách người dùng</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    background-color: #f4f4f4;
                    margin: 20px;
                }

                table {
                    width: 100%;
                    border-collapse: collapse;
                    background: white;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                }

                th,
                td {
                    border: 1px solid #ddd;
                    padding: 10px;
                    text-align: left;
                }

                th {
                    background-color: #007bff;
                    color: white;
                }

                tr:nth-child(even) {
                    background-color: #f9f9f9;
                }

                .btn {
                    padding: 5px 10px;
                    border: none;
                    cursor: pointer;
                }

                .btn-create {
                    background-color: #28a745;
                    color: white;
                    padding: 10px;
                    text-decoration: none;
                    display: inline-block;
                    margin-bottom: 10px;
                }

                .btn-update {
                    background-color: #ffc107;
                    color: white;
                }

                .btn-delete {
                    background-color: #dc3545;
                    color: white;
                }
            </style>

            <script>
                function deleteUser(userId) {
                    if (confirm('Bạn có chắc chắn muốn xóa?')) {
                        fetch(`/admin/user/delete/${userId}`, {
                            method: 'DELETE'
                        }).then(response => {
                            if (response.ok) {
                                alert('Xóa thành công!');
                                location.reload();
                            } else {
                                alert('Lỗi khi xóa người dùng.');
                            }
                        });
                    }
                }
            </script>
        </head>

        <body>
            <h2>Danh sách người dùng</h2>

            <!-- Nút tạo người dùng mới -->
            <a href="/admin/user" class="btn btn-create">Create User</a>

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
                            <th>Hành động</th> <!-- Thêm cột Hành động -->
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${users}">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.name}</td>
                                <td>${user.location}</td>
                                <td>
                                    <!-- Nút Update -->
                                    <a href="/admin/user/show/${user.id}" class="btn btn-update">View</a>
                                    <a href="/admin/user/update/${user.id}" class="btn btn-update">Update</a>
                                    <!-- mac dinh the a co method get -->

                                    <!-- Nút Delete với AJAX -->
                                    <a href="/admin/user/delete/${user.id}" class="btn btn-update">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>

        </body>

        </html>