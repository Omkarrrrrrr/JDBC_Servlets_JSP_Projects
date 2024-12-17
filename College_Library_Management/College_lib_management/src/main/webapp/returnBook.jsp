<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Return Book - Library Management</title>
</head>
<body>
    <h2>Return Book</h2>
    <form action="returnBook" method="post">
        <label for="bookId">Book ID: </label><br>
        <input type="number" id="bookId" name="bookId" required><br><br>
        
        <label for="userId">User ID: </label><br>
        <input type="number" id="userId" name="userId" required><br><br>
        
        <label for="returnDate">Return Date: </label><br>
        <input type="date" id="returnDate" name="returnDate" required><br><br>
        
        <input type="submit" value="Return Book">
    </form>
</body>
</html>
