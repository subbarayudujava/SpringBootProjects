package com.nt.service;

import java.util.List;

import com.nt.entity.StudentEntity;

public interface StudentService {
	
	public String insertData(StudentEntity Student);
	 
	public String insertMutlipleData(List<StudentEntity> entity);
	
	public List<StudentEntity> getEmployeeData();
	  
	public String deleteData(Integer id);
	
}
