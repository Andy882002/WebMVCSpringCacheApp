package com.sample.domain;

import java.util.Date;

public class Vendor {

	private Integer vid;
	private Float Balance;
	private Float MinPayment;
	private Date LastPaydate;
	private Date LastInvDate;
	private String Name;
	private String Contact;
	private Address address;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public Float getBalance() {
		return Balance;
	}
	public void setBalance(Float balance) {
		Balance = balance;
	}
	public Float getMinPayment() {
		return MinPayment;
	}
	public void setMinPayment(Float minPayment) {
		MinPayment = minPayment;
	}
	public Date getLastPaydate() {
		return LastPaydate;
	}
	public void setLastPaydate(Date lastPaydate) {
		LastPaydate = lastPaydate;
	}
	public Date getLastInvDate() {
		return LastInvDate;
	}
	public void setLastInvDate(Date lastInvDate) {
		LastInvDate = lastInvDate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", Balance=" + Balance + ", MinPayment="
				+ MinPayment + ", LastPaydate=" + LastPaydate
				+ ", LastInvDate=" + LastInvDate + ", Name=" + Name
				+ ", Contact=" + Contact + ", address=" + address + "]";
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
