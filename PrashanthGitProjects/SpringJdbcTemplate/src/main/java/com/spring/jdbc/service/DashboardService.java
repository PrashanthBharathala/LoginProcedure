package com.spring.jdbc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.bo.DashboardBo;
@Service("DashService")
public class DashboardService {

	private String dname;
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Autowired
	private DashboardBo dashBo;
	
	public List<Map<String, Object>> getDashboardData(String dname) {
		List<Map<String, Object>> list=dashBo.getDashboardData(dname);
		return list;
	}
}
