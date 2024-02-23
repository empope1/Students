<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Students</title>
</head>
<body>
<form action = "editItemServlet" method="post">
Name: <input type = "text" name = "name" value = "${itemToEdit.name}">
Major: <input type = "text" name = "major" value = "${itemToEdit.major}">
 <input type = "hidden" name = "id" value = "${itemToEdit.id}">
<input type="submit" value = "Save Edited Student">

</form>

</body>
</html>