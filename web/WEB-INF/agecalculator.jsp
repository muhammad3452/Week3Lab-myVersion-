<%-- 
    Document   : agecalculator
    Created on : 2-Oct-2022, 3:39:10 PM
    Author     : muham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="Age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
        ${message}<br>
        <a href="arithmetic">Arithmetic Calculator</a>
        


      
     
        
    </body>
</html>
