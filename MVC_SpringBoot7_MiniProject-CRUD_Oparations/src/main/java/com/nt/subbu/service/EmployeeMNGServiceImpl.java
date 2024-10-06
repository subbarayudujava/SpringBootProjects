
package com.nt.subbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.subbu.model.Employee;
import com.nt.subbu.repository.IEmployeeRepository;

@Service
public class EmployeeMNGServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepository empRepository;

	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		return "Employee is Save" + empRepository.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeDataByUsingId(Integer empno) {
	    Employee emp = empRepository.findById(empno)
	        .orElseThrow(() -> new IllegalArgumentException("Employee not found with ID: " + empno));
	    return emp;
	}


}
