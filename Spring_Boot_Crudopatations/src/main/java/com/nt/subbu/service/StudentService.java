
package com.nt.subbu.service;

import java.util.List;

import com.nt.subbu.entirty.StudentEntity;

public interface StudentService {
	String registerStudent(StudentEntity entity);

	List<StudentEntity> findAll();
	 String delteData(Integer id );
}
