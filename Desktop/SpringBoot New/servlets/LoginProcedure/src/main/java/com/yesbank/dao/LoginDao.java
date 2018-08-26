package com.yesbank.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.yesbank.entity.Loginpojo;
import com.yesbank.entity.TopicPojo;
import com.yesbank.entity.TopicPojo1;

@Repository
public class LoginDao {

@Autowired
private SimpleJdbcCall call;

public TopicPojo getLoginDetails(String adid, String password)
{
	call.setProcedureName("LOGIN_PROCEDURE_SAMPLE");
	Map<String, String>map=new HashMap<String,String>();
	map.put("AD", adid);
	map.put("pwd",password);
	Map<String, Object> map1=call.execute(map);
	
	TopicPojo pojo=new TopicPojo();
	
	pojo.setAdid((String) map1.get("ADID"));
	pojo.setFullname((String)map1.get("FULLNAME"));
	pojo.setRole((String) map1.get("ROLE"));
	pojo.setLastLogin((String) map1.get("LASTLOGIN"));
	
	return pojo;
}



}
