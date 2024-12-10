<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
      <h1>Edit Employee Details</h1>
      <form action="update" method="post">
        <input type="number" name="id" value=${emp.id} hidden>
       Name: <input type="text" name="name" value="${emp.name}"> <br><br>
       Email: <input type="email" name="email"  value="${emp.email}"> <br><br>
       Mobile: <input type="number" name="mobile"  value="${emp.mobile}"> <br><br>
       Salary: <input type="number" name="salary"  value="${emp.salary}"> <br><br>
       <button>Update</button>
      </form>
      <br>
      <br>
      <a href="home"><button>Home</button></a>
  </div>
</body>
</html>