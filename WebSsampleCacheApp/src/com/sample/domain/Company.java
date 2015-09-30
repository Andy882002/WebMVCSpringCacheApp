package com.sample.domain;

public class Company {

	private Integer cid;
	private String Mission;
	private String Name;
	private Integer Revenue;
	private String taxID;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getMission() {
		return Mission;
	}
	public void setMission(String mission) {
		Mission = mission;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getRevenue() {
		return Revenue;
	}
	public void setRevenue(Integer revenue) {
		Revenue = revenue;
	}
	public String getTaxID() {
		return taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", Mission=" + Mission + ", Name="
				+ Name + ", Revenue=" + Revenue + ", taxID=" + taxID + "]";
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company(Integer cid, String mission, String name, Integer revenue,
			String taxID) {
		super();
		this.cid = cid;
		Mission = mission;
		Name = name;
		Revenue = revenue;
		this.taxID = taxID;
	}
}
