package com.yesbank.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yesbank.entity.Loginpojo;
import com.yesbank.entity.TopicPojo;
import com.yesbank.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;
	
	
	@RequestMapping(value="/getLoginDetails.do",method=RequestMethod.GET)
	public String getLoginDetails(@RequestParam("adid") String adid,@RequestParam("password") String password,Map<String,Object> map) 
	{
		TopicPojo pojo=service.getLoginDetail(adid, password);
		map.put("fullname",pojo.getFullname());
		map.put("role", pojo.getRole());
		map.put("adid", pojo.getAdid());
		map.put("lastlogin", pojo.getLastLogin());
		return "dashboard";
	
		
	}
}
