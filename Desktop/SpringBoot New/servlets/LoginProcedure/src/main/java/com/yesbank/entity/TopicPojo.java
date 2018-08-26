package com.yesbank.entity;

public class TopicPojo
{

	private String adid;
	private String fullname;
	private String role;
	private String lastLogin;
	public String getAdid() {
		return adid;
	}
	public void setAdid(String adid) {
		this.adid = adid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "TopicPojo [adid=" + adid + ", fullname=" + fullname + ", role=" + role + ", lastLogin=" + lastLogin
				+ "]";
	}
	
}
