<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
                </style>
            </head>

            <body>
                <h2>Danh sách người dùng</h2>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Tên</th>
                            <th>Địa chỉ</th>
                            <th>Số điện thoại</th>
                            <th>Email</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${users}">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.name}</td>
                                <td>${user.location}</td>
                                <td>${user.phone}</td>
                                <td>${user.email}</td>
                                <td>
                                    <button>Create</button>
                                    <button>Update</button>
                                    <button>Delete</button>
                                </td>
                            </tr>

                        </c:forEach>
                    </tbody>
                </table>
            </body>

            </html>