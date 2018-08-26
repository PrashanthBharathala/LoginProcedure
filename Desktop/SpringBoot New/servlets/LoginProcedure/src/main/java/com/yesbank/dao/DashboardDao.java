package com.yesbank.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.yesbank.entity.TopicPojo1;

@Repository
public class DashboardDao {

	@Autowired
	private SimpleJdbcCall call;
	
	public TopicPojo1 getDashboarddetails(String adid,String role)
	{
		call.setProcedureName("LOGIN_PROCEDURE_SAMPLE");
		Map<String, String>map=new HashMap<String,String>();
		map.put("AD", adid);
		map.put("rol",role);
		Map<String, Object> map1=call.execute(map);
		
		TopicPojo1 pojo=new TopicPojo1();
		
		pojo.setTopicCount((int) map1.get("ADID"));
		pojo.setRuleCount((int)map1.get("FULLNAME"));
		pojo.setActionCount((int) map1.get("ROLE"));
		pojo.setPendingAuth((int) map1.get("LASTLOGIN"));
		
		return pojo;
	}
}
