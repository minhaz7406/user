<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read All User</title>
</head>
<body>
  <Table>
  <tr>
     <th>FirstName</th>
     <th>LastName</th>
     <th>UserName</th>
     <th>Email</th>
     <th>DOB</th>
     <th>Delete</th>
     <th>Update</th>
    </tr> 
     <c:forEach var="user" items="${user}">
      <tr>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
        <td>${user.userName}</td>
        <td>${user.email}</td>
        <td>${user.dOB}</td>
        <td><a href="deleteById?id=${user.id}">delete</a></td>
        <td><a href="updateUser?id=${user.id}">update</a></td>
        </tr>
        </c:forEach>
  </Table>
</body>
</html>