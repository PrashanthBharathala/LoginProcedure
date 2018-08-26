package com.yesbank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yesbank.dao.DashboardDao;
import com.yesbank.entity.DashPojo;
import com.yesbank.entity.TopicPojo1;

@Service
public class DashboardService {

	@Autowired
	private DashboardDao dao;
	
	public DashPojo getDashboard(String adid,String role)
	{
		DashPojo pojo1=dao.getDashboarddetails(adid, role);
		return pojo1;
	}
}
