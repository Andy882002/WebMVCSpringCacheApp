package com.sample.domain;

public class Address {

	private String City;
	private String State;
	private String Street;
    private String Zip;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
    
	public Address(){}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Street="
				+ Street + ", Zip=" + Zip + "]";
	}
	
	
	
}
