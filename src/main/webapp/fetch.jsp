<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
   <h1>Employee Records</h1>
   <table border="1">
      <tr>
           <th>Name</th>
           <th>Email</th>
           <th>Mobile</th>
           <th>Salary</th>
           <th>Delete</th>
           <th>Edit</th>
      </tr>
      
      <x:forEach var="emp" items="${list}">
      
      <tr>
       <td>  ${emp.name }</td>
       <td>  ${emp.email }</td>
       <td>  ${emp.mobile }</td>
        <td>  ${emp.salary }</td>
        <td><button>Delete</button></td>
         <td><button>Edit</button></td>
      </tr>
      </x:forEach>
   </table>
   <br>
   <a href="home"><button>Back</button></a>
</div>
</body>
</html>