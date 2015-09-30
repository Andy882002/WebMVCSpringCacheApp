<html ng-app>
<head>
<title>Angular JS Includes</title>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>

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
<h2>AngularJS Sample Application</h2>
<div ng-controller="Hello"> 

<table>
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
      
      <td>
      {{ x.pid }}    
      </td>
      <td>{{ x.homeaddress.street+'   '+ x.homeaddress.city+'   '+ x.homeaddress.state +'   '+x.homeaddress.zip }}</td>
	  <td>{{ x.eid }}</td>
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
     <td>{{x.company.cid}}</td>
     <td>{{x.company.name}}</td>
     <td>{{x.company.taxID}}</td>
     <td>{{x.company.revenue}}</td>
     <td>{{x.company.mission}}</td>
   </tr>
</table>
      </td>
        <td>{{x.title}}</td>
         <td>{{x.salary}}</td>
         <td>{{x.name}}</td>
          <td>{{ x.ssn}}</td>
           <td>{{x.dob}}</td>
            <td>{{x.age  }}</td>
          <td>{{x.favorColors[0]+ '   '+ x.favorColors[1] }}</td>
          
              
          </tr>
</table>
</div>
<script>
function Hello($scope, $http) {
    var ssions=sessionStorage.getItem("userssn");
    alert("ID: "+ ssions);
    $http.get('http://localhost:7001/WebSsampleCacheApp/Sample/getemp/'+ssions).
        success(function(data) {
            $scope.x = data;
        });
}

</script>



</body>
</html>