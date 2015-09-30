package com.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

import com.sample.login.*;
//import com.sample.user.User;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//import org.json.simple.*;
//import org.json.simple.parser.JSONParser;



//import com.entity.domain.Employee;
import com.intersys.objects.*;
import com.sample.dao.*;
import com.sample.domain.*;

@Controller
@RequestMapping("/Sample")
public class SampleController {
	 private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	    
	    
	//@Autowired  getSomeEmployee()
	//EmployeeDao eservice;
	EmployeeDaoImpl eservice=new EmployeeDaoImpl();
	
	
	 
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/view", method = RequestMethod.GET,headers="Accept=application/json")
	 public @ResponseBody List<Employee> getEmployees() throws CacheException
 {
		
		List<Sample.Employee> employees=eservice.getAllEmployee();
        Employee employee;
        Integer pid=0;
        String Name="";
        List<String> flist=new ArrayList<String>();
        String sSn="";
        //Date dOB=new Date();
        Date dOB=new Date(0);
        Integer age=0;
        
        Integer eid=0;
        Integer cid=0;
       Company company;//=new Company();
        String tile="";
        Integer salary=0;
        String Note="";
        
      
         List<Employee> mlist=new ArrayList<Employee>();
  for( Sample.Employee empl  : employees){
	 
	 String emid=empl.getId().toString();
	  Integer myid=(Integer)Integer.parseInt(emid);
	  
	  pid=myid;
      Name=empl.getName();
      flist=empl.getFavoriteColors();
      sSn=empl.getSSN();
      dOB=empl.getDOB();
	  age=empl.getAge();
      eid=myid;
      //company
  	  String stid=empl.getCompany().getId().toString();
	  cid=Integer.parseInt(stid);
	  String mission=empl.getCompany().getMission();
	  String cname=empl.getCompany().getName();
	  Integer revenue=empl.getCompany().getRevenue();
	  String taxID=empl.getCompany().getTaxID();
	  company=new Company(cid, mission, cname, revenue, taxID);
	  tile=empl.getTitle();
	  salary=empl.getSalary();
	  Note=empl.getNotesOut().toString();
      
  	  
      //employee.setHomeaddress();
  	  Address address= new Address();
  	  address.setCity(empl.getHome().getCity());
  	  address.setState(empl.getHome().getState());
  	  address.setStreet(empl.getHome().getStreet());
  	  address.setZip(empl.getHome().getZip());
     
  	employee=new Employee(pid, age, flist, Name, sSn, dOB, address, eid, company, 
			                tile, salary, Note);
  	
	  mlist.add(employee);
	  System.out.println("------  -----"+employee.toString());
	  //System.out.println("**** this is list of employee: "+mlist);
	  
      
  }
  System.out.println("**** this is list of employee: "+mlist.toString()+"\n");
  
  
   return mlist;
}
	
	/////
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/smdata", method = RequestMethod.GET,headers="Accept=application/json")
	 public @ResponseBody List<Employee> getSMEmployees() throws CacheException
 {
		
		List<Sample.Employee> employees=eservice.getSomeEmployee();
        Employee employee;
        Integer pid=0;
        String Name="";
        List<String> flist=new ArrayList<String>();
        String sSn="";
       // Date dOB=new Date();
        Date dOB=new Date(0);
        Integer age=0;
        
        Integer eid=0;
        Integer cid=0;
       Company company;//=new Company();
        String tile="";
        Integer salary=0;
        String Note="";
        
      
         List<Employee> mlist=new ArrayList<Employee>();
  for( Sample.Employee empl  : employees){
	 
	 String emid=empl.getId().toString();
	  Integer myid=(Integer)Integer.parseInt(emid);
	  
	  pid=myid;
      Name=empl.getName();
      flist=empl.getFavoriteColors();
      sSn=empl.getSSN();
      dOB=empl.getDOB();
	  age=empl.getAge();
      eid=myid;
      //company
  	  String stid=empl.getCompany().getId().toString();
	  cid=Integer.parseInt(stid);
	  String mission=empl.getCompany().getMission();
	  String cname=empl.getCompany().getName();
	  Integer revenue=empl.getCompany().getRevenue();
	  String taxID=empl.getCompany().getTaxID();
	  company=new Company(cid, mission, cname, revenue, taxID);
	  tile=empl.getTitle();
	  salary=empl.getSalary();
	  Note=empl.getNotesOut().toString();
      
  	  
      //employee.setHomeaddress();
  	  Address address= new Address();
  	  address.setCity(empl.getHome().getCity());
  	  address.setState(empl.getHome().getState());
  	  address.setStreet(empl.getHome().getStreet());
  	  address.setZip(empl.getHome().getZip());
     
  	employee=new Employee(pid, age, flist, Name, sSn, dOB, address, eid, company, 
			                tile, salary, Note);
  	
	  mlist.add(employee);
	  System.out.println("------  -----"+employee.toString());
	  //System.out.println("**** this is list of employee: "+mlist);
  }
  System.out.println("**** this is list of employee: "+mlist.toString()+"\n");
   return mlist;
}
	
	
	
	///
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/getemp/{td}",  method = RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody Employee getEmployee(@PathVariable("td") int td)throws CacheException {
		//Employee employee;
		//Sample.Employee empl=eservice.getEmpoly(td); //getEmp  getEmpoly
		Sample.Employee empl=eservice.getEmp(td); //getEmp  getEmpoly
		Integer pid=Integer.parseInt(empl.getId().toString());
		Integer age=empl.getAge();
		List<String> flist=empl.getFavoriteColors();
		String Name=empl.getName();
		String sSn=empl.getSSN();
		Address address= new Address();
	  	  address.setCity(empl.getHome().getCity());
	  	  address.setState(empl.getHome().getState());
	  	  address.setStreet(empl.getHome().getStreet());
	  	  address.setZip(empl.getHome().getZip());
	  	  Integer eid=pid;
	  	  String tile=empl.getTitle();
	  	  String Note=empl.getName();
	  	  Integer salary=empl.getSalary();
	  	  Date dOB=empl.getDOB();
		
	  	 String stid=empl.getCompany().getId().toString();
		 Integer cid=Integer.parseInt(stid);
		  String mission=empl.getCompany().getMission();
		  String cname=empl.getCompany().getName();
		  Integer revenue=empl.getCompany().getRevenue();
		  String taxID=empl.getCompany().getTaxID();
		  Company company=new Company(cid, mission, cname, revenue, taxID);
	       
	    	Employee employee=new Employee(pid, age, flist, Name, sSn, dOB, address, eid, company, 
	  			                tile, salary, Note);
		
		return employee;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayCustomerForm(ModelMap model) {
		logger.info("Welcome home! The client locale is {}.");
		model.addAttribute("getLogins", new GetLogins());
		return "SignUpForm";
 
	}
	
	
	@RequestMapping(value = "/signupts", method = RequestMethod.POST)
	public String addCustomer(@Valid GetLogins getLogins, BindingResult result, ModelMap model) {
        int id=getLogins.getEid();

            RestTemplate restTemplate = new RestTemplate();
	  String url="http://localhost:7001/WebSsampleCacheApp/Sample/getemp/"+id;
	  Employee employee2=restTemplate.getForObject(url, Employee.class,id);
	  
	  model.addAttribute("employee", employee2 );

       // String resuts=eservice.DoisEmployeeExists(id);
        logger.info("Welcome home! The client locale is {}.");
        
		if (result.hasErrors()) {
			return "SignUpForm";
		} else {
			
			return "Done";
			
		}
 
	}

	
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public ModelAndView displayEmployee(@ModelAttribute Employee employee ) throws ParseException{                //ModelMap model) {
		String name=employee.getName();
		String title=employee.getTitle();
		String ssn=employee.getSSN();
		int salary=employee.getSalary();
		int id=employee.getEid();
		System.out.println("DB1:"+employee.getAge());
		//java.sql.Date date=(java.sql.Date)employee.getDOB();
		System.out.println("DB2:"+"   --- "+employee.getDOB());
		//@SuppressWarnings("deprecation")
		//int dats=employee.getDOB().getYear();
		 //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//	Date convertedCurrentDate = sdf.parse(date);
		   String date2=employee.getDOB().toString();
		  System.out.println("DB2:"+"   --- "+date2);
		   // person.setDOB(java.sql.Date.valueOf(date2));
		////
		
		Sample.Employee empls=eservice.updatedEmployee2(name,title, salary, ssn, id, date2);
		
		RestTemplate restTemplate = new RestTemplate();
		  String url="http://localhost:7001/WebSsampleCacheApp/Sample/getemp/"+id;
		  Employee employee2=restTemplate.getForObject(url, Employee.class,id);
		System.out.println("Updated Employee:  "+employee2.toString());
		//ModelMap model=new ModelMap();
		//model.addAttribute("employee", employ);
		 return new ModelAndView("ModifyEmp", "employee", employee2);
		//return "MyEdit";
 
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/dispEmployee/{eid}")
    public ModelAndView dispUser(@PathVariable("eid") int eid)throws CacheException { 
   RestTemplate restTemplate = new RestTemplate();
  String url="http://localhost:7001/WebSsampleCacheApp/Sample/getemp/{eid}";
  Employee employee=restTemplate.getForObject(url, Employee.class,eid);
        return new ModelAndView("dispEmployee", "employee", employee);
    }
	
	@RequestMapping(value="/deletemp/{td}",  method = RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<Employee> deletEmployee(@PathVariable("td")int td) throws CacheException{
		eservice.deletEmp(td);
		List<Employee> mlist=new ArrayList<Employee>();
		RestTemplate restTemplate = new RestTemplate();
		  String url="http://localhost:7001/WebSsampleCacheApp/Sample/view";
		  mlist=restTemplate.getForObject(url, List.class);
		  return mlist;
	}
	
	@RequestMapping(value="/logins/{emid}" , method = RequestMethod.GET)
	public String getEmpNum(@PathVariable("emid") int emid,  Locale locale, Model model)throws CacheException{
		RestTemplate restTemplate = new RestTemplate();
		  String url="http://localhost:7001/WebSsampleCacheApp/Sample/getemp/"+emid;
		  Employee employee2=restTemplate.getForObject(url, Employee.class,emid);
		  
		  model.addAttribute("employee", employee2 );
		////
		
		//String numb=employee2.getName();
				
		return "login";
	}

	 @RequestMapping(value = "/signup", method = RequestMethod.POST)
		public String addCustomer(@Valid GetLogins getLogins, BindingResult result) {
	        int id=getLogins.getEid();
	       // String resuts=eservice.DoisEmployeeExists(id);
	        logger.info("Welcome home! The client locale is {}.");
	        
			if (result.hasErrors()) {
				return "SignUpForm";
			} else {
				
				return "Done";
				
			}
	 
		}
	 
	 @RequestMapping(value = "/signup2", method = RequestMethod.POST)
		public String addCustomers(@Valid GetLogins getLogins, BindingResult result) {
	        int id=getLogins.getEid();
	       // String resuts=eservice.DoisEmployeeExists(id);
	        logger.info("Welcome home! The client locale is {}.",eservice.isEmployeeExists(id));
	        
			if (result.hasErrors()) {
				return "SignUpForm";
			} else {
				if (eservice.isEmployeeExists(id)) {
				return "Done";
				}
				else {
					return "redoit";
				}
			}
	 
		}
	 
	
	 
	 @RequestMapping(value="/getSesion",method=RequestMethod.GET)
		public ModelAndView SetBeanInSession(@RequestHeader ("Cookie") String cookie, HttpSession session){
			//session.setAttribute("employeeObj",new User(123, "876-098-1762","Uiyn@yahoo.com"));
		 //return new ModelAndView("ModifyEmp", "employee", employee2);
		   //session.getId()
			System.out.println("Look session: "+session.getId()+ "  -- "+session.getValue("userssn"));
			return new ModelAndView("Done", "empSession", session.getValue("userssn"));
			//return "Done";
		}
	
}
