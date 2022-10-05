<%-- 
    Document   : arithmeticcalculator
    Created on : 2-Oct-2022, 4:55:18 PM
    Author     : muham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            First: <input type="text" name="firstvalue" value="${firstvalue}"><br>
            Second <input type="text" name="secondvalue" value="${secondvalue}"><br>
            <input type="submit" value="+" name="addition"> <input type="submit" value="-" name="subtraction"> <input type="submit" value="*" name="multiply"> <input type="submit" value="%" name="remainder"><br><br>
            Result: ${message}<br>
            <a href="Age">Age Calculator</a>

            
        </form>
    </body>
</html>
