package com.spring.jdbc.bo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.DashboardDao;

@Component
public class DashboardBoImpl implements DashboardBo {

	@Autowired
	private DashboardDao dashDao;

	public List<Map<String, Object>> getDashboardData(String dname) {
		List<Map<String, Object>> list=dashDao.getDashboardData(dname);
		return list;
	}
	
}
