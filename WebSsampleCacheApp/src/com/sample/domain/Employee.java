package com.sample.domain;

//import java.util.Date;
import java.util.List;
//import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.Range;
import java.sql.Date; 

public class Employee extends Person {

	private Integer eid;
	private Company company;
	private String Title;
	private Integer Salary;
	private String Note;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	
public Employee(Integer pid, Integer age, List<String> favorColors,
			String name, String sSN, Date dOB, Address homeaddress,
			Integer eid, Company company, String title, Integer salary,
				String note) {
		super(pid, age, favorColors, name, sSN, dOB, homeaddress);
		this.eid = eid;
		this.company = company;
		Title = title;
		Salary = salary;
		Note = note;
	}

   public Employee(){
	   super();
   }
	
}
