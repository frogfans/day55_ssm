package com.qfedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.SqlSession;

import com.qfedu.entity.Employee;

public interface EmployeeDao {

	public List<Employee> findAll();
	
	// 插入操作，sql语句的写法和xml配置中写法相同
	public void add(Employee emp);
	
	// 删除操作
	public void deleteById(int id);
	
	public Employee findById(int id);
	
	public void update(Employee emp);
	
}






