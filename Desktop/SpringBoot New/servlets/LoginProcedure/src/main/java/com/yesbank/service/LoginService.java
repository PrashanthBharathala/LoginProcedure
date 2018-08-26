package com.yesbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yesbank.dao.LoginDao;
import com.yesbank.entity.TopicPojo;

@Service
public class LoginService {

	@Autowired
	private LoginDao dao;
	
	public TopicPojo getLoginDetail(String adid,String password)
	{
		TopicPojo pojo=dao.getLoginDetails(adid, password);
		return pojo;
	}
}
