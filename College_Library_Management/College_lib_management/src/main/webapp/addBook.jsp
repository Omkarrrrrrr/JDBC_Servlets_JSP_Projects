<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book - Library Management</title>
</head>
<body>
    <h2>Add New Book</h2>
    <form action="addBook" method="post">
        <label for="title">Title: </label><br>
        <input type="text" id="title" name="title" required><br><br>
        
        <label for="author">Author: </label><br>
        <input type="text" id="author" name="author" required><br><br>
        
        <label for="year">Year: </label><br>
        <input type="number" id="year" name="year" required><br><br>
        
        <input type="submit" value="Add Book">
    </form>
</body>
</html>
