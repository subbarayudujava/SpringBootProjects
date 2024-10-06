package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
   
	@Query(value = "SELECT MAX(SALARY) FROM Employee",nativeQuery = true)
	Double findGraterSalary();
	//EmployeeEntity findGraterSalary();

}
