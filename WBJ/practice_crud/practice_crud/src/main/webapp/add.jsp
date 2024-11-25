<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user</title>
</head>
<body>
<h1>Add New User</h1>
    <form action="users" method="post">
        <input type="hidden" name="action" value="add">
        <label for="name">Name:</label><input type="text" name="name" required><br>
        <label for="email">Email:</label><input type="email" name="email" required><br>
        <button type="submit">Add User</button>
    </form>
</body>
</html>