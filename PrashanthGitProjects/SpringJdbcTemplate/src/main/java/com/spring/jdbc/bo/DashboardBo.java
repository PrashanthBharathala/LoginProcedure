package com.spring.jdbc.bo;

import java.util.List;
import java.util.Map;

public interface DashboardBo {
	public List<Map<String,Object>> getDashboardData(String dname);
}
