<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>User Information</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    margin: 50px;
                    padding: 20px;
                    background-color: #f4f4f4;
                    align-items: center;
                }

                .container {
                    margin: auto;
                    background: white;
                    padding: 20px;
                    border-radius: 10px;
                    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
                    height: 60%;
                    width: 70%;
                    align-items: center;

                }

                h2 {
                    text-align: center;
                }

                .info {
                    margin: 10px 0;
                    font-size: 18px;
                }
            </style>
        </head>

        <body>
            <div class="container">
                <h2>User Information</h2>
                <div class="info"><strong>ID: ${id} </strong> </div>
                <div class="info"><strong>Name: ${user.name} </strong></div>
                <div class="info"><strong>Email: ${user.email} </strong></div>
                <div class="info"><strong>Phone: ${user.phone} </strong> </div>
                <div class="info"><strong>Location: ${user.location}</strong></div>
            </div>
        </body>

        </html>