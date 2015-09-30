package com.sample.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
//import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import Sample.Employee;

import com.intersys.objects.CacheException;
import com.intersys.objects.CacheQuery;
import com.intersys.objects.Database;
import com.intersys.objects.Id;
import com.sample.utility.DBUtility;

public class EmployeeDaoImpl implements EmployeeDao{
     
	private Database dbconnection = null;
	//@Autowired
	public EmployeeDaoImpl() {
		dbconnection =DBUtility.createConnection();
	}

	public Database getDbconnection() {
		return dbconnection;
	}
	//@Autowired
	public void setDbconnection(Database dbconnection) {
		this.dbconnection = dbconnection;
	}
	@Override
	public List<Sample.Employee> getAllEmployee(){
	  	
		List<Sample.Employee> employees=new ArrayList<Sample.Employee>();
		Sample.Employee employee=null;
		String strID=null;
		//String cid;
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee Where ID > 30 AND Age >20";
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		         
		    	  System.out.println(" --- "+rs.getString("ID"));
		          strID=rs.getString("ID");
		          employee = (Sample.Employee)Sample.Employee._open(dbconnection, new Id(strID));
		         
		          employees.add(employee);
		          //dbconnection.close();
		        }
		      //dbconnection.close();
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      //dbconnection.close();
		      return employees;
		
	}
	
	public List<Sample.Employee> getSomeEmployee(){
		List<Sample.Employee> employees=new ArrayList<Sample.Employee>();
		Sample.Employee employee=null;
		String strID=null;
		//String cid;
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee Where Name %STARTSWITH 'X'";
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		         
		    	  System.out.println(" --- "+rs.getString("ID"));
		          strID=rs.getString("ID");
		          employee = (Sample.Employee)Sample.Employee._open(dbconnection, new Id(strID));
		         
		          employees.add(employee);
		          //dbconnection.close();
		        }
		      //dbconnection.close();
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      //dbconnection.close();
		      return employees;
		
		
	}
	
	@Override
	public Sample.Employee updatedEmployee2(String name,String title, int salary, String ssn, int id, String date){
		
		//List<IVPS.Employee> employees=new ArrayList<IVPS.Employee>();
		Sample.Employee employee=null;
		String strID=null;
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee WHERE ID="+id;
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      while (rs.next()){
		      strID=rs.getString("ID");
		      employee = (Sample.Employee)Sample.Employee._open(this.dbconnection, new Id(strID));
		      employee.setName(name);
		      employee.setSalary(salary);
		      employee.setTitle(title);
		      employee.setSSN(ssn);
		      //java.sql.Date date1=(java.sql.Date) date;
		      //erson.setDOB(java.sql.Date.valueOf("1950-06-22"));
		      employee.setDOB(java.sql.Date.valueOf(date));
		      employee._save();
		      System.out.println(" Date of Birth--- "+employee.getDOB());
		    // dbconnection.closeObject(employee.getOref());
			 employee = null;
		      }
		     // System.out.println(" Date of Birth--- "+employee.getDOB());
			    // Close the connection
			   // dbconnection.close();
		     
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 //dbconnection.close();
		 return employee;
	 	    
	}
	
	@Override
	public Sample.Employee updatedEmployee(String name,String title, int salary, String ssn, int id){
		
		//List<IVPS.Employee> employees=new ArrayList<IVPS.Employee>();
		Sample.Employee employee=null;
		String strID=null;
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee WHERE ID="+id;
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      while (rs.next()){
		      strID=rs.getString("ID");
		      employee = (Sample.Employee)Sample.Employee._open(this.dbconnection, new Id(strID));
		      employee.setName(name);
		      employee.setSalary(salary);
		      employee.setTitle(title);
		      employee.setSSN(ssn);
		      employee._save();
		      System.out.println(" Date of Birth--- "+employee.getDOB());
		    // dbconnection.closeObject(employee.getOref());
			 employee = null;
		      }
			    // Close the connection
			   // dbconnection.close();
		      //System.out.println(" Date of Birth--- "+employee.getDOB());
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 //dbconnection.close();
		 return employee;
	 	    
	}
	@Override
	public Sample.Employee getEmp(Integer tt){
		Sample.Employee employee=null;
		 String strID=(String)Integer.toString(tt);
		try { 
		     
		    employee= (Sample.Employee)Sample.Employee._open(dbconnection, new Id(strID));
		           
		        
		    System.out.println(employee.toString());
		     
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	      
		      return employee;
		
	}
	
	@Override
	public Sample.Employee getEmpoly(int tt){
		Database dbconnections = DBUtility.createConnection();
		Sample.Employee empl=null; //getEmp(tt);
		String strID=null;
		String cid=Integer.toString(tt);
		System.out.println("step 1 *** "+tt+ "   --  : "+cid);
		 try { 
			 Sample.Employee employee=null;
		      String SQL = "SELECT ID FROM Sample.Employee WHERE ID ="+tt;
		      
		      CacheQuery query = new CacheQuery(dbconnections, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		         
		    	  System.out.println(" ######## Step 2: "+rs.getString("ID"));
		          strID=rs.getString("ID");
		          employee = (Sample.Employee)Sample.Employee._open(dbconnections, new Id(strID));
		           
		        }
		      empl=(Sample.Employee)employee;
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	    
		      return empl;
		   

	   }
	@Override
	public List<Sample.Company> getAllCompany(){
		
		List<Sample.Company> companys=new ArrayList<Sample.Company>();
		Sample.Company company=null;
		String strID=null;
		
		 try { 
		      String SQL = "SELECT ID FROM Sample.Company";
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		         
		    	  System.out.println(" --- "+rs.getString("ID"));
		          strID=rs.getString("ID");
		          company = (Sample.Company)Sample.Company._open(dbconnection, new Id(strID));
		         
		          companys.add(company);
		          //dbconnection.close();
		        }
		     // dbconnection.close();
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      //dbconnection.close();
		      return companys;
		
	}
	@Override
	public List<Sample.Vendor> getAllVendors(){
		
		List<Sample.Vendor> vendors=new ArrayList<Sample.Vendor>();
		Sample.Vendor vendor=null;
		String strID=null;
		//Sample.Person person=(Sample.Person)Sample.Person._
		 try { 
		      String SQL = "SELECT ID FROM Sample.Vendor";
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		         
		    	  System.out.println(" --- "+rs.getString("ID"));
		          strID=rs.getString("ID");
		          vendor = (Sample.Vendor)Sample.Vendor._open(dbconnection, new Id(strID));
		         
		          vendors.add(vendor);
		          //dbconnection.close();
		        }
		     // dbconnection.close();
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      //dbconnection.close();
		      return vendors;
	}
	
	@Override
	public Sample.Company getCompany(Integer tt){
		//List<IVPS.Employee> employees=new ArrayList<IVPS.Employee>();
		Sample.Company company=null;
		String strID=null;
		String cid;
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee WHERE ID="+tt;
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		         
		    	  System.out.println(" ######## "+rs.getString("ID"));
		          strID=rs.getString("ID");
		          company = (Sample.Company)Sample.Company._open(dbconnection, new Id(strID));
		           
		        }
		      //dbconnection.close(); //attention here
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	    
		      return company;
	   }
	
	@Override
	public boolean deletEmp(int td){
		
		Sample.Employee employee=null;
		String strID=null;
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee WHERE ID="+td;
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      while (rs.next()){
		      strID=rs.getString("ID");
		      employee = (Sample.Employee)Sample.Employee._open(this.dbconnection, new Id(strID));
		      employee.delete();
		      //employee._save();
		      
		    // dbconnection.closeObject(employee.getOref());
			 //employee = null;
		      }
			    // Close the connection
			   // dbconnection.close();
		     
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return true;
	}

	@Override
	public void insertEmployee(int eip, int age,  String ssn, String title, String name, int salary) throws SQLException
	{
			     // Connection conn = JDBCExamples.createConnection();
			      String sql =
			      "INSERT INTO Sample.Employee (ID, Age, Company, DOB, FavorColors, Name, Notes, Picture, SSN, Salary, Spouse, "
			      + "   Title, Home_City, Home_State, Home_Street, Home_Zip,Office_City, Office_State, Office_Street, Office_Zip )"+
			      "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			      PreparedStatement pstmt;
				try {
					pstmt = dbconnection.prepareStatement(sql);
					pstmt.setInt(1, eip);
				      pstmt.setInt(2, age);
				      pstmt.setString(3, ssn);
				      pstmt.setString(4, title);
				      pstmt.executeUpdate();
				} catch (CacheException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      
			   }
	
	@Override
    public boolean isEmployeeExists(int tt) {

		     String strID=null;
                boolean ans=false;
                
		 try { 
		      String SQL = "SELECT ID FROM Sample.Employee WHERE ID ="+tt;
		      CacheQuery query = new CacheQuery(dbconnection, SQL);
		      java.sql.ResultSet rs= query.execute();
		      
		      while (rs.next()){
		          strID=rs.getString("ID");
		          if (strID !=null) {
                          ans=true;
                    }
		        }
		     
		      } catch (SQLException e) {
	             e.printStackTrace();
	       } catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	     return ans;
    }


	
}
