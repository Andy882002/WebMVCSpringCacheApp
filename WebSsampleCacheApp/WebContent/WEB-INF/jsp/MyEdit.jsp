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
   
   <div>  
    <table  border="1" align="center" style="width:50%">
    <thead>
       <tr>
      <th>
      
          Personal ID: 
      </th>
      <th>Home Address </th>
	  <th>Employee ID</th>
       <th>company Inform</th>
       <th>title</th>
       <th>
         Salary
        
       </th>
       <th>
          Employee Name
          
        </th>
       <th>SSN </th>
       <th>Date Of Birth</th>
       <th>Age</th>
       <th>colors</th>
   </tr>
   <tr>
      </thead>
      <td>
      ${employee.pid}     
      </td>
      <td>${employee.homeaddress.street},  ${employee.homeaddress.city}, ${employee.homeaddress.state},  ${employee.homeaddress.zip} </td>
	  <td>${employee.eid}</td>
      <td>
   <table>
    <tr>
     <th>Company ID</th>
     <th>Company Name</th>
     <th>Company TaxID</th>
     <th>Company Revenue: $ </th>
     <th>Company Mission</th>
   </tr>
  <tr>
     <td>${employee.company.cid}</td>
     <td>${employee.company.name}</td>
     <td>${employee.company.taxID}</td>
     <td>${employee.company.revenue}</td>
     <td>${employee.company.mission}</td>
   </tr>
</table>
     
      </td>
        <td>${employee.title}</td>
         <td>${employee.salary}</td>
         <td>${employee.name}</td>
         <td>${employee.SSN}</td> 
         <td>${employee.DOB}</td> 
         <td>${employee.age}</td> 
         <td>${employee.favorColors[0]}, ${employee.favorColors[1]} </td> 
          </tr>
</table>
</div>
 </center>  
</body>  
</html>  
