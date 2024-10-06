
package com.mk.service;

import java.util.List;

import com.mk.entity.EmployeeEntity;

public interface EmployeeService {
   String  registerEmployee(EmployeeEntity entity); //insert the employee Data
   
   List<EmployeeEntity> findAllEmployees(); //find all Employees /display employees
   
   EmployeeEntity findEmployeebyId(Integer id); //find employee by id
   
   String updateEmployeeName(Integer id,String name); //update the Employee Name only based on Id
   
   String updateEmployeeData(EmployeeEntity entity); //to update the Total data of Employee
   
   String deleteEmployeeDataById(Integer id);//to remove the data based on id
   
   String deleteAllEmployees(); //delete all Employees, no need to take any params,
                                         //coz we're not specifying any column
}//class