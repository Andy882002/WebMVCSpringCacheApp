package com.sample.login;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class GetLogins {
	@Range(min = 1, max = 300) //age need between 1 and 150
	private int eid;
	@NotEmpty //make sure name is not empty
	private String ssn;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public GetLogins() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetLogins(int eid, String ssn) {
		super();
		this.eid = eid;
		this.ssn = ssn;
	}
	
	
}
