<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<h2>Fill Details Here</h2>
<body>
<form action="updateUserDetails">
    <table>
     <tr>
       <td>  <input type="hidden" name="id" value="${user.id}"/></td>
         </tr>
         <tr>
      <tr>
         <td>FirstName<input type="text" name="firstName" value="${user.firstName }"/></td>
         </tr>
         <tr>
         <td>LastName<input type="text" name="lastName" value="${user.lastName }"/></td>
         </tr>
         <tr>
         <td>UserName<input type="text" name="userName" value="${user.userName }"/></td>
         </tr>
         <tr>
         <td>Email<input type="text" name="email" value="${user.email }"/></td>
         </tr>
         <tr>
         <td>DOB<input type="text" name="dOB" value="${user.dOB}"/></td>
         </tr>
    </table>

</form>
</body>
</html>