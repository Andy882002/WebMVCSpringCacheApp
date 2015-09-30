<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <h2>Employee Condensed Table</h2>
  <p>The .table-condensed class makes a table more compact by cutting cell padding in half:</p>            
  <table class="table table-condensed">
    <thead>
      <tr>
        <th>Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Title</th>
        <th>Employee SSN</th>
        <th>Employee DOB</th>
        <th>Employee Age</th>
        <th>Favor Colors</th>
        <th>Street</th>
         <th>City</th>
          <th>State</th>
           <th>ZIP</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${employee.pid}</td>
        <td>${employee.name}</td>
        <td>${employee.title}</td>
        <td>${employee.SSN}</td>
        <td>${employee.DOB}</td>
        <td>${employee.age}</td>
        <td>${employee.favorColors[0]}  ${employee.favorColors[1]}</td>
        <td>${employee.homeaddress.street}</td>
        <td>${employee.homeaddress.city}</td>
        <td>${employee.homeaddress.state}</td>
        <td>${employee.homeaddress.zip}</td>
      
      </tr>
      
    </tbody>
  </table>
</div>

</body>


</html>