package com.yesbank.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@PropertySource(value = { "ClassPath:/db.properties" })
@Configuration
@ComponentScan(basePackages= {"com.yesbank.controller","com.yesbank.service","com.yesbank.dao"})
@EnableWebMvc
public class LoginConfig {

	
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource getDataSource()
	{
		System.out.println("hi iam trapped");
		BasicDataSource ds=new BasicDataSource();
		System.out.println(env.getRequiredProperty("driverClassName"));
		ds.setDriverClassName(env.getRequiredProperty("driverClassName"));
		ds.setUrl(env.getRequiredProperty("url"));
		//ds.setUsername(env.getRequiredProperty("username"));
		ds.setUsername("system");
		ds.setPassword(env.getRequiredProperty("password"));
		return ds;
	}
	@Bean
	public SimpleJdbcCall getCall()
	{
	
		SimpleJdbcCall call=new SimpleJdbcCall(getDataSource());
		return call;
	}
	
	@Bean
	public ViewResolver getResolver()
	{
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/");
		view.setSuffix(".jsp");
		return view;
		
	}
	
	
}
