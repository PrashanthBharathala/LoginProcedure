package com.yesbank.entity;

public class Loginpojo
{

	private String Adid;
	private String password;
	public String getAdid() {
		return Adid;
	}
	public void setAdid(String adid) {
		Adid = adid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Loginpojo [Adid=" + Adid + ", password=" + password + "]";
	}
	
}
