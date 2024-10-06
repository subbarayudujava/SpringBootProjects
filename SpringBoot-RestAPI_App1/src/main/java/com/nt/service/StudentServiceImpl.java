package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.StudentEntity;
import com.nt.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;

	@Override
	public String insertData(StudentEntity student) {
       Optional<StudentEntity> optionalStudent = repository.findById(student.getId());
		if (optionalStudent.isEmpty()) {
			repository.save(student);
			return "Student data register";
		} //if
		else {
			if (optionalStudent.get().getAccountStatus().equalsIgnoreCase("no")) {
				StudentEntity studententity = optionalStudent.get();
				studententity.setAccountStatus("yes");
				repository.save(studententity);
				return "Student account Re-Activated";
			} //if
			else {

				return "Student data already registered";
			}//inner else
		}//outer else
	}

	@Override
	public String insertMutlipleData(List<StudentEntity> entity) {
		repository.saveAll(entity);
		return "Mutliple data Inserted";
	}

	@Override
	public List<StudentEntity> getEmployeeData() {

		return repository.findAll();

	}

	@Override
	public String deleteData(Integer id) {
		repository.deleteById(id);
		return "employee data deleted";
	}
}
