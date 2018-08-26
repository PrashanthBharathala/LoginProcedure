package com.yesbank.entity;

public class DashboardPojo {

	private String adid;
	private String role;
	public String getAdid() {
		return adid;
	}
	public void setAdid(String adid) {
		this.adid = adid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "DashboardPojo [adid=" + adid + ", role=" + role + "]";
	}
	
}
