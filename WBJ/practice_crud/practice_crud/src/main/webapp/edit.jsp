<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit User</h1>
	<form action="users" method="post">
		<input type="hidden" name="action" value="update"> <input
			type="hidden" name="id" value="${user.id}"> <label for="name">Name:</label>
		<input type="text" id="name" name="name" value="${user.name}" required><br>
		<label for="email">Email:</label> <input type="email" id="email"
			name="email" value="${user.email}" required><br>
		<button type="submit">Update</button>
	</form>
	<a href="users">Back to User List</a>
</body>
</html>