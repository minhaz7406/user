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
<form action="saveUserDetails">
    <table>
      <tr>
         <td>FirstName<input type="text" name="firstName"/></td>
         </tr>
         <tr>
         <td>LastName<input type="text" name="lastName"/></td>
         </tr>
         <tr>
         <td>UserName<input type="text" name="userName"/></td>
         </tr>
         <tr>
         <td>Email<input type="text" name="email"/></td>
         </tr>
         <tr>
         <td>DOB<input type="text" name="dOB"/></td>
         </tr>
    </table>
</form>

</body>
</html>