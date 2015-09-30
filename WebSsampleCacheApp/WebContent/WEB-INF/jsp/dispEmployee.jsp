<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>

<style>
table, th , td {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 5px;
}
table tr:nth-child(odd) {
  background-color: #f2f2f2;
}
table tr:nth-child(even) {
  background-color: #ffffff;
}

</style>

</head>
<body> 

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
</body>
</html>