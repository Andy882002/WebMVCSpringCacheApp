<html>
<head>
<title>Angular JS Includes</title>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
 <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
   <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
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
a {
  text-decoration:none
}
</style>
</head>
<body>
<h2>AngularJS Sample Application</h2>
<div ng-app="myApp" ng-controller="customersCtrl"> 
<span class="label">Ordered By: {{orderByField}}, Reverse Sort: {{reverseSort}}</span><br><br>
<p>Find a Employee: <input type="text" ng-model="tdas"></p><hr>
<table>
   <tr>
      <th>
       <a href="#" ng-click="orderByField='pid'; reverseSort = !reverseSort">
          Personal ID: <span ng-show="orderByField == 'pid'"><span ng-show="!reverseSort">^</span><span ng-show="reverseSort">v</span></span>
          </a>
      </th>
      <th>Home Address </th>
	  <th>Employee ID</th>
       <th>company Inform</th>
       <th>title</th>
       <th>
         <a href="#" ng-click="orderByField='salary'; reverseSort = !reverseSort">
          Salary $: <span ng-show="orderByField == 'salary'"><span ng-show="!reverseSort">^</span><span ng-show="reverseSort">v</span></span>
          </a>
       </th>
       <th>
          <a href="#" ng-click="orderByField='name'; reverseSort = !reverseSort">
          Employee Name <span ng-show="orderByField == 'name'"><span ng-show="!reverseSort">^</span><span ng-show="reverseSort">v</span></span>
          </a>
        </th>
       <th>SSN </th>
       <th>Date Of Birth</th>
       <th>Age</th>
       <th>colors</th>
   </tr>
   <tr ng-repeat="x in names | filter:tdas | orderBy:orderByField:reverseSort " ng-animate="{enter: 'animate-enter', leave: 'animate-leave'}">
      <td>
       <!--  <p> <button ng-click="aEmpdata(x.eid)">ttplink </button></p> -->
       <p><button><a href="http://localhost:7001/WebSsampleCacheApp/Sample/dispEmployee/{{x.pid}}">Add Employee</a></p>
      {{ x.pid }}
    </div></a>
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
     <td>{{x.company.name | uppercase}}</td>
     <td>{{x.company.taxID}}</td>
     <td>{{x.company.revenue}}</td>
     <td>{{x.company.mission}}</td>
   </tr>
</table>
      </td>
        <td>{{x.title | uppercase}}</td>
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
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
   $scope.vlinks="http://localhost:7001/WebSsampleCacheApp/Sample/view";
   $scope.Emplink="http://localhost:7001/WebSsampleCacheApp/Sample/getemp/";
   $scope.aEmpdata=function(eid) {
      var glik;
      glik=$scope.Emplink+eid;
      $http.get(glik).success(function (datas) {
       $scope.names = datas;

    });
      
   };
  $http.get($scope.vlinks)
  .success(function (response) {
     
     $scope.names = response;

    });
});
</script>

</body>
</html>