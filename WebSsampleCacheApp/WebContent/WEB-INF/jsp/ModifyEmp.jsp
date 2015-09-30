<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
 pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>  
<head>  
<title>Being Java Guys | Spring DI Hello World</title>  
<style>  
body {  
 font-size: 20px;  
 color: teal;  
 font-family: Calibri;  
}  
  
td {  
 font-size: 15px;  
 color: black;  
 width: 100px;  
 height: 22px;  
 text-align: center;  
}  
.heading {  
 font-size: 18px;  
 color: white;  
 font: bold;  
 background-color: orange;  
 border: thick;  
}  
</style>  
</head>  
<body>  
 <center>  
    
   
   
 <b>User  
   List | Being Java Guys </b>  
   
  <table border="1">  
   <tr>  
    <td class="heading">Employee Id</td>  
    <td class="heading">Name</td>  
    <td class="heading">Company Name</td>  
    <td class="heading">SSN</td>  
    <td class="heading">Title</td>  
    <td class="heading">Salary</td>  
    <td class="heading">Age</td> 
     <td class="heading">Date of Birth</td>
      <td class="heading">Edit back</td>
       <td class="heading">Deleted employee</td>  
   </tr>  
     
    <tr>  
     <td>${employee.getPid()}</td>  
     <td>${employee.getName()}</td>  
     <td>${employee.getCompany().getName()}</td>  
     <td>${employee.getSSN()}</td>  
     <td>${employee.getTitle()}</td>  
     <td>${employee.getSalary()}</td> 
     <td>${employee.getAge()}</td>
      <td>${employee.getDOB()}</td> 
     <td><a href="http://localhost:7001/WebSsampleCacheApp/JUTAPANGU.jsp">Edit</a></td>  
     <td><a href="delete?id=${employee.pid}">Delete</a></td>  
    </tr>  
   <tr><td colspan="7"><a href="register">Add New User</a></td></tr>  
  </table>  
  
 </center>  
</body>  
</html>  
