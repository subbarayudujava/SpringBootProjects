package com.mk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.entity.EmployeeEntity;
import com.mk.repository.EmployeeRepopository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepopository repopository;

	@Override
	public String registerEmployee(EmployeeEntity entity) {
		repopository.save(entity);
		return "Register Successfull";
	}

	@Override
	public List<EmployeeEntity> findAllEmployees() {
		List<EmployeeEntity> list = repopository.findAll();
		return list;
	}

	@Override
	public EmployeeEntity findEmployeebyId(Integer id) {
		Optional<EmployeeEntity> employeeEntity = repopository.findById(id);//to retrieve the data
		EmployeeEntity employeeEntity1 = null;
		if (employeeEntity.isPresent()) {
			employeeEntity1 = employeeEntity.get();
		} //if
		return employeeEntity1;
	}

	@Override
	public String updateEmployeeName(Integer id, String name) {
		Optional<EmployeeEntity> byId = repopository.findById(id);//to retrieve the data
		if (byId.isPresent()) {
			EmployeeEntity employeeEntity = byId.get();
			employeeEntity.setName(name);
			repopository.save(employeeEntity);
		} //if
		return "Employee Updated Successfully";
	}

	@Override
	public String updateEmployeeData(EmployeeEntity entity) {
		Optional<EmployeeEntity> byId = repopository.findById(entity.getId());//to retrieve the data
		EmployeeEntity employeeEntity = null;
		if (byId.isPresent()) {
			employeeEntity = byId.get();
			employeeEntity.setName(entity.getName());
			employeeEntity.setMobile(entity.getMobile());
			employeeEntity.setAddress(entity.getAddress());
			employeeEntity.setPincode(entity.getPincode());

			repopository.save(employeeEntity);
			return "Employee Data Updated Successfully";
		} //if
		else {
			return "Employee Not Found";
		} //else
	}

	@Override
	public String deleteEmployeeDataById(Integer id) {
		Optional<EmployeeEntity> byId = repopository.findById(id); //to retrieve the data
		if (byId.isPresent()) { //if data Available
			repopository.deleteById(id);
			return "Employee Deleted with id :: "+id;
		}//if
		else {
			return "Employee Not Found with id :: "+id;
		}//else
	}
	
	@Override
	public String deleteAllEmployees() {
		repopository.deleteAll();
		return "Employees Data Deleted";
	}

}//class