package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

public interface DashboardDao {

public List<Map<String,Object>> getDashboardData(String dname);
}
