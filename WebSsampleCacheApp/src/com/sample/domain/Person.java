package com.sample.domain;

import java.util.Arrays;
//import java.util.Date;
import java.sql.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

//import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.Range;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

public class Person {
	@Range(min = 1, max = 150)
	private Integer pid;
	private Integer Age;
	private List<String> FavorColors;
	@NotEmpty
    private String Name;
	@NotEmpty
    private String SSN;
    private Date DOB;
    private Address homeaddress;
   
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public List<String> getFavorColors() {
		return FavorColors;
	}
	public void setFavorColors(List<String> favorColors) {
		FavorColors = favorColors;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Address getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", Age=" + Age + ", FavorColors="
				+ FavorColors + ", Name=" + Name + ", SSN=" + SSN + ", DOB="
				+ DOB + ", homeaddress=" + homeaddress + "]";
	}
	public Person(Integer pid, Integer age, List<String> favorColors,
			String name, String sSN, Date dOB, Address homeaddress) {
		super();
		this.pid = pid;
		Age = age;
		FavorColors = favorColors;
		Name = name;
		SSN = sSN;
		DOB = dOB;
		this.homeaddress = homeaddress;
	}
	
	public Person(){}
	
	
}
