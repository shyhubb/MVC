<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

            <!DOCTYPE html>
            <html lang="vi">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Form Đăng Ký</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
            </head>

            <body>
                <div class="container mt-5">
                    <div class="row justify-content-center">
                        <div class="col-md-6">
                            <div class="card">
                                <div class="card-header bg-primary text-white text-center">
                                    <h4>Form Đăng Ký</h4>
                                </div>
                                <div class="card-body">
                                    <form:form method="post" action="/admin/user/register" modelAttribute="newUser">
                                        <div class="mb-3">
                                            <label for="fullName" class="form-label">Họ và tên</label>
                                            <form:input type="text" class="form-control" id="fullName"
                                                placeholder="Nhập họ và tên" path="name" />
                                        </div>
                                        <div class="mb-3">
                                            <label for="email" class="form-label">Email</label>
                                            <form:input type="email" class="form-control" id="email"
                                                placeholder="Nhập email" path="email" />
                                        </div>
                                        <div class="mb-3">
                                            <label for="password" class="form-label">Mật khẩu</label>
                                            <form:input type="password" class="form-control" id="password"
                                                placeholder="Nhập mật khẩu" path="password" />
                                        </div>
                                        <div class="mb-3">
                                            <label for="address" class="form-label">Địa chỉ</label>
                                            <form:input type="text" class="form-control" id="address"
                                                placeholder="Nhập địa chỉ" path="location" />
                                        </div>
                                        <div class="mb-3">
                                            <label for="phone" class="form-label">Số điện thoại</label>
                                            <form:input type="text" class="form-control" id="phone"
                                                placeholder="Nhập số điện thoại" path="phone" />
                                        </div>
                                        <button type="submit" class="btn btn-primary w-100">Đăng Ký</button>
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
            </body>

            </html>