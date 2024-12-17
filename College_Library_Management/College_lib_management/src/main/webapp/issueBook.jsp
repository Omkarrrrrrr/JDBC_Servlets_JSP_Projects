<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Issue Book - Library Management</title>
</head>
<body>
    <h2>Issue Book</h2>
    <form action="issueBook" method="post">
        <label for="bookId">Book ID: </label><br>
        <input type="number" id="bookId" name="bookId" required><br><br>
        
        <label for="userId">User ID: </label><br>
        <input type="number" id="userId" name="userId" required><br><br>
        
        <label for="issueDate">Issue Date: </label><br>
        <input type="date" id="issueDate" name="issueDate" required><br><br>
        
        <input type="submit" value="Issue Book">
    </form>
</body>
</html>
