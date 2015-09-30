package com.sample.dao;

import java.sql.SQLException;
import java.util.List;
//import java.sql.Date;
import java.util.Date;
public interface EmployeeDao {

	public List<Sample.Employee> getAllEmployee();
	public List<Sample.Employee> getSomeEmployee();
	public Sample.Employee updatedEmployee2(String name,String title, int salary, String ssn, int id, String date);
	public Sample.Employee updatedEmployee(String name,String title, int salary, String ssn, int id);
	public Sample.Employee getEmpoly(int tt);
	public Sample.Employee getEmp(Integer tt);
	public List<Sample.Company> getAllCompany();
	public List<Sample.Vendor> getAllVendors();
	public Sample.Company getCompany(Integer tt);
	public boolean deletEmp(int td);
	public void insertEmployee(int eip, int pid,  String ssn, String title, String nmae, int salary) throws SQLException;
	public boolean isEmployeeExists(int tt);
}
