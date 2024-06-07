<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="bootstrap.jsp" %>
<body>

<form action="register" method="post">
<input type="text"placeholder="Enter Rollnumber"class="form-control" name="rollnumber">
<input type="text"placeholder="Enter Fullname"class="form-control" name="name">
<input type="text"placeholder="Branch"class="form-control" name="branch">
<input type="email"placeholder="Email"class="form-control" name="email">
<input type="text"placeholder="Section"class="form-control" name="section">
<button class="btn btn-primary">Register</button>

</form>
</body>
</html>