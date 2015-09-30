<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>jQuery UI Tabs functionality</title>
      <link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
      <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
      <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
     <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
     <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">      
     
    
     
     <!-- here is angulary sample -->
      <style>
       #price, th , td {
              border: 1px solid grey;
              border-collapse: collapse;
              padding: 5px;
             }
       #price tr:nth-child(odd) {
             background-color: #f2f2f2;
           }
       #price tr:nth-child(even) {
             background-color: #ffffff;
       }
       a {
            text-decoration:none
       }

   div.demo {
      background: #FFF8DC none repeat scroll 0 0;
      border: 3px solid #666;
      margin: 5px;
      padding: 5px;
      position: relative;
      width: 1200px;
      height: 700px;
      overflow: auto;
     }
</style>

     <!-- here is angulary sample -->
     <!-- signle table -->
      <style>
table.tabl1, th , td {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 5px;
}
table.tabl1 tr:nth-child(odd) {
  background-color: #f2f2f2;
}
table.tabl1 tr:nth-child(even) {
  background-color: #ffffff;
}
</style>
        
    
     <!-- signle table -->

      <script>
         $(function() {
            $( "#tabs-1" ).tabs();
         });
      </script>
      <style>
         #tabs-1{font-size: 14px;}
         .ui-widget-header {
            background:#b9cd6d;
            border: 1px solid #b9cd6d;
            color: #FFFFFF;
            font-weight: bold;
         }
      </style>
      
       <style>
h1 {
    border-bottom: 3px solid #080808;
    color: #996600;
    font-size: 30px;
}
h1.hbl2 {
    text-align: center;
    color: black;
}
table, th , td  {
    border: 1px solid grey;
    border-collapse: collapse;
    padding: 5px;
}
table, tr:nth-child(odd)	{
    background-color: #f1f1f1;
}
table, tr:nth-child(even) {
    background-color: #ffffff;
}
th {
 width: 30%;
}
td {
 width: 30%
}

</style>
      
   </head>
   <body  ng-app="myApp" ng-controller="customersCtrl">
      <div id="tabs-1">
         <ul>
            <li><a href="#tabs-2">Tab 1</a></li>
            <li><a href="#tabs-3">Tab 2</a></li>
            <li><a href="#tabs-4">Tab 3</a></li>
             <li><a href="http://localhost:7001/WebSsampleCacheApp/Sample">Login Page</a></li>
         </ul>
         <div id="tabs-2">
            <p>Neque porro quisquam est qui dolorem ipsum quia dolor sit 
            amet, consectetur, adipisci velit...  </p>
           <!-- <h3><a href="http://localhost:7001/WebSampleEmployeeCacheApp/Sample">Back to Login Page</a></h3> -->
      <!-- Here is start tabs-2 or Tab 1 -->
     <center>
           <div class="demo"><h1>
                <h2>AngularJS Sample Application</h2>
                  <!--  <p>Input a Employee ID: <input type="text" ng-model="eid"></p>
                  <button class="btn btn-warning" ng-click="deletes(eid)">
                  <span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;Remove{{eid}}
                  </button><br>--> 
          <div class="posts"> 
               <span class="label">Ordered By: {{orderByField}}, Reverse Sort: {{reverseSort}}</span><br><br>
               <p>Find a Employee: <input type="text" ng-model="tdas"></p><hr>
              <table class="price" id="price">
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
                     <button class="btn btn-warning" ng-click="editEmpl(x.pid)">
                     <span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;Edit
                     </button><br>
    
                     <p><button><a href="http://localhost:7001/WebSsampleCacheApp/Sample/dispEmployee/{{x.pid}}">Add Employee</a></button></p><div style="height:100%;width:100%">
                     <br>
                    {{ x.pid }}
      
                    </div>
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
                    <td>{{x.company.revenue | currency}}</td>
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
<!-- Here is end div i move to end of form -->
       <hr>
        <button class="btn btn-success" ng-click="reset()">
        <span class="glyphicon glyphicon-user"></span> Reset & Create New User
        </button>
      <hr>

       <h3 ng-show="edit">Create New Country:</h3>
       <h3 ng-hide="edit">Edit Country:</h3>
        
      <form novalidate class="form-horizontal" action="Sample/insert" method="post">
           <div class="form-group">
            <label class="col-sm-2 control-label">Name:</label>
            <div class="col-sm-10">
            <input type="text" ng-model="name" name="name" placeholder="name">
            </div>
          </div>
  
          <div class="form-group">
               <label class="col-sm-2 control-label">SSN:</label>
               <div class="col-sm-10">
                  <input type="text" ng-model="ssn"  name="SSN" placeholder="SSN">
               </div>
         </div>

         <div class="form-group">
             <label class="col-sm-2 control-label">Date of Birth:</label>
             <div class="col-sm-10">
               <input type="text" ng-model="dob"  name="dOB" placeholder="DOB">
             </div>
         </div>
         
         <div class="form-group">
             <label class="col-sm-2 control-label">Age:</label>
             <div class="col-sm-10">
               <input type="text" ng-model="age"  name="age" placeholder="Age">
             </div>
         </div>

        <div class="form-group">
             <label class="col-sm-2 control-label">Person ID:</label>
             <div class="col-sm-10">
                 <input type="text" ng-model="pid"  name="pid" ng-disabled="!edit" placeholder="pid">
             </div>
        </div>

       <div class="form-group">
            <label class="col-sm-2 control-label">Employee ID:</label>
            <div class="col-sm-10">
            <input type="text" ng-model="eid"  name="eid"  placeholder="eid"> 
           </div>
       </div>

         <div class="form-group">
              <label class="col-sm-2 control-label">Company:</label>
              <div class="col-sm-10">
                 <input type="text" ng-model="company.name"  name="company.name" placeholder="company.name">
              </div>
         </div>

        <div class="form-group">
             <label class="col-sm-2 control-label">Title:</label>
             <div class="col-sm-10">
                <input type="text" ng-model="title"  name="title" placeholder="title">
             </div>
        </div>

       <div class="form-group">
            <label class="col-sm-2 control-label">Salary:</label>
             <div class="col-sm-10">
               <input type="text" ng-model="salary"  name="salary" placeholder="salary">
             </div>
       </div>
       <button type="submit" class="btn btn-success" value="Employee">Submit</button><br>
       <!--  <input type="submit" value="Employee"> -->

     </form>
          <br><h3>Delete a employee:</h3>
          <button class="btn btn-warning" ng-click="deletes(eid)">
          <span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;Remove
          </button><br>
         <hr>
       </div>
      </h1><!-- here is end on h1 by tabs-2 -->
     </div><!-- end class="demo" -->
   </center>

         </div><!--- first end tabs-2-->

         <div id="tabs-3">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
            sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
            nisi ut aliquip ex ea commodo consequat. </p>
           
           <h2>AngularJS Sample Application</h2><br>
           <p>Input Your Employee ID: <input type="number" ng-model="number"></p>
            <p> <button type="button" class="btn btn-info" ng-click="aEmpdata(number)">ttplink </button></p>
      <div> 
           <span class="label">Ordered By: {{orderByField}}, Reverse Sort: {{reverseSort}}</span><br><br>
            <p>Find a Employee: <input type="text" ng-model="tdas"></p><hr>
        <table>
          <tr>
           <th>
            Personal ID: 
          </th>
            <th>Home Address </th>
	        <th>
	         <a href="#" ng-click="orderByField='eid'; reverseSort = !reverseSort">
            Employee ID: <span ng-show="orderByField == 'eid'"><span ng-show="!reverseSort">^</span><span ng-show="reverseSort">v</span></span>
           </a>
	        </th>
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
          <tr ng-repeat="y in master | filter:tdas | orderBy:orderByField:reverseSort " ng-animate="{enter: 'animate-enter', leave: 'animate-leave'}">
          <td>
            <p><button><a href="http://localhost:7001/WebSsampleCacheApp/Sample/dispEmployee/{{y.pid}}">Add Student</a></button></p><div style="height:100%;width:100%">
       
            {{ y.pid }}
        
          </td>
          <td>{{ y.homeaddress.street+'   '+ y.homeaddress.city+'   '+ y.homeaddress.state +'   '+y.homeaddress.zip }}</td>
	      <td>{{ y.eid }}</td>
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
            <td>{{y.company.cid}}</td>
            <td>{{y.company.name | uppercase}}</td>
            <td>{{y.company.taxID}}</td>
            <td>{{y.company.revenue}}</td>
            <td>{{y.company.mission}}</td>
           </tr>
          </table>
         </td>
          <td>{{y.title | uppercase}}</td>
          <td>{{y.salary}}</td>
          <td>{{y.name}}</td>
          <td>{{ y.ssn}}</td>
           <td>{{y.dob}}</td>
            <td>{{y.age  }}</td>
          <td>{{y.favorColors[0]+ '   '+ y.favorColors[1] }}</td>
          
              
          </tr>
      </table>
    </div>
            
           
            
         </div>

         <div id="tabs-4" style="background-color:great; color:black; padding:50px;">
            <p>ed ut perspiciatis unde omnis iste natus error sit 
            voluptatem accusantium doloremque laudantium, totam rem aperiam, 
            eaque ipsa quae ab illo inventore veritatis et quasi architecto 
            beatae vitae dicta sunt explicabo.  </p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
            sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
            nisi ut aliquip ex ea commodo consequat. </p>
         
            <h2>AngularJS Sample Application</h2>
            <!--<div ng-app="cityApp" ng-controller="studentController"> -->
             
                <table class="tabl1" >
                  <tr>
                    <th>Name</th>
                    <th>City</th>
	                <th>Country</th>
                  </tr>
          
               <tr ng-repeat="student in students">
               <td>{{ student.Name }}</td>
               <td>{{ student.City }}</td>
	           <td>{{ student.Country }}</td>
             </tr>
            </table>
         </div>
      </div>        

      </div> <!-- all end di -->
  <script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
  $scope.orderByField = 'eid';
  $scope.reverseSort = false;
  var ssion=sessionStorage.getItem("userssn");
 
   alert("fund out your storage : "+ ssion);
   
  $http.get("http://localhost:7001/WebSsampleCacheApp/Sample/view")
  .success(function (response) {
  $scope.names = response;
  $scope.master=response;
  });
  
   $http.get("http://www.w3schools.com/website/customers_mysql.php").success( function(datas) {
      $scope.students = datas;
   });
  ////// take out from here
    $scope.name='';
    $scope.ssn='';
     $scope.age='';
     $scope.dob='';
     $scope.company='';
  $scope.title='';
  $scope.salary='';
   $scope.pid='';
  
  $scope.editEmpl = function(id) {
  if (id == 'new') {
    $scope.edit = true;
    $scope.incomplete = true;
    $scope.name = '';
    $scope.ssn = '';
     $scope.age='';
     $scope.dob='';
    $scope.pid='';
    } else {
    $scope.edit = false;
    for(var i=0;i<$scope.names.length;i++){
       if(id==$scope.names[i].pid) {
        $scope.name = $scope.names[i].name;
         $scope.ssn = $scope.names[i].ssn;
         $scope.age=$scope.names[i].age; 
         $scope.dob=$scope.names[i].dob;
         $scope.pid = $scope.names[i].pid;
    
        $scope.eid=$scope.names[i].eid;
        $scope.company=$scope.names[i].company;
        $scope.title=$scope.names[i].title;
        $scope.salary=$scope.names[i].salary; 
         break; 
       }
          
    }
   
  }
};

/// take out end here
//
 //$scope.Emplink="http://localhost:7001/WebSsampleCacheApp/Sample/getemp/"; http://localhost:7001/WebSsampleCacheApp/Sample/dispEmployee/{{x.pid}}
   $scope.aEmpdata=function(eid) {
     // var glik;
      //glik=$scope.Emplink+eid;
      $http.get("http://localhost:7001/WebSsampleCacheApp/Sample/smdata").success(function (datas) {
       $scope.master = datas;
       alert("Successfully changes");
       //return $scope.master;

    });
      
   };

//

$scope.reset = function(){
		$scope.name ='';
		$scope.ssn = '';
		$scope.age='';
		$scope.dob='';
		$scope.pid ='';
		$scope.eid='';
       $scope.company='';
       $scope.title='';
      $scope.salary='';
   }   
   $scope.reset();

$scope.getindex=function(dx) {
   
   return $scope.emidex=dx;
}

$scope.deletes=function(idt) {
   alert("Do You want to delete employee with id: "+idt);
  $http.get("http://localhost:7001/WebSsampleCacheApp/Sample/deletemp/"+idt).success( function(dedata) {
      $scope.demps = dedata;
      $scope.names=angular.copy($scope.demps);
   });
   
   $scope.reset();
};

});
</script>


 <script>
$(document).ready(function(){
    // Count rows
    var length = $('tr', $('.price')).not('tr:first').length;
    // Build links to rows from row 1 (to ignore table header)
   // for( i=1; i <= length; i++ ) {
     //   $('.pages').append('<a class="linkrow" href="'+i+'">Row '+i+'</a> | ');
   // }
    // On click
    $('a.linkrow').on('click',function(e){
        // Prevent default
        e.preventDefault();
        // Get row index from link href
        var rowId = $(this).attr('href');
        // Get row position by index
        var ypos = $('.price tr:eq('+rowId+')').offset().top;
        // Go to row 500 is high size
        $('.posts').animate({
            scrollTop: $('.posts').scrollTop()+ypos
           
        }, 500);
        // Some CSS to visualize which row is being viewed
        $('.price tr').css({'background-color': 'none'});
        $('.price tr:eq('+rowId+')').css({ 'background-color': '#ccc' } );
    });
});
</script>
<script>
var mainApp = angular.module("cityApp", []);

mainApp.controller('studentController', function($scope,$http) {
   
   $http.get("http://www.w3schools.com/website/customers_mysql.php").success( function(response) {
      $scope.students = response;
   });
});
</script>

   </body>
</html>