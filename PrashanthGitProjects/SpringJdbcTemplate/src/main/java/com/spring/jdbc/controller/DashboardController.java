package com.spring.jdbc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.spring.jdbc.config.DashConfig;
import com.spring.jdbc.service.DashboardService;
@Controller
public class DashboardController 
{
    public static void main( String[] args )
    {
    	String dname=args[0];
    	System.out.println("controller check "+dname);
    	
        ApplicationContext context=new AnnotationConfigApplicationContext(DashConfig.class);
        DashboardService service=context.getBean("DashService",DashboardService.class);
        //service.setDname(dname);
        List<Map<String,Object>>list=service.getDashboardData(dname);
        System.out.println("controller------list::"+list);
        
    }
}
