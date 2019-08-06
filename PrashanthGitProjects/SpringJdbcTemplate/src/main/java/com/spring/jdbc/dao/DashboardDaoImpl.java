package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class DashboardDaoImpl implements DashboardDao{

	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	private Environment env;
	
	//public static final String dashQuery="select * from dashboard where dname=?";
	
	public List getDashboardData(String dname) {
		
		List<Map<String,Object>> list=template.queryForList(env.getProperty("dashQuery"),dname);
		return list;
	}

}
