package com.nt.subbu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.subbu.model.Department;

public interface IDeportmentRepository extends CrudRepository<Department, Integer> {
	
	@Query("select deptno from dept")
	public List<Integer> getAlldeptno();
}
