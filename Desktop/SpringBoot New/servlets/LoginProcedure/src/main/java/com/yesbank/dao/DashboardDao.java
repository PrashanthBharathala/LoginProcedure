package com.yesbank.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.yesbank.entity.DashPojo;
import com.yesbank.entity.TopicPojo1;

@Repository
public class DashboardDao {

	@Autowired
	private SimpleJdbcCall call;
	
	public DashPojo getDashboarddetails(String adid,String role)
	{
		call.setProcedureName("DASHBOARD_PROCEDURE_SAMPLE");
		Map<String, String>map=new HashMap<String,String>();
		map.put("AD", adid);
		map.put("rol",role);
		Map<String, Object> map1=call.execute(map);
		
		DashPojo pojo=new DashPojo();
		pojo.setActionCount((int) map1.get("TOPICCOUNT"));
		pojo.setRuleCount((int) map1.get("RULECOUNT"));
		pojo.setActionCount((int) map1.get("ACTIONCOUNT"));
		pojo.setPendingAuthorization((int)map1.get("PENDINGAUTHORIZATION"));
		
		return pojo;
	}
}
