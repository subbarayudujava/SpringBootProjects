
package com.nt.subbu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.subbu.entirty.StudentEntity;
import com.nt.subbu.repository.StudentRepository;

@Service
public class ServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;

	@Override
	public String registerStudent(StudentEntity entity) {
		StudentEntity data = repository.save(entity);
		if (data.getSid() != null) {
			return "Rigistation succusfull";
		} else {
			return "Registration Failed";
		} //else

	}

	@Override
	public List<StudentEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public String delteData(Integer id) {
		repository.deleteById(id);
		return "Deleted data";
	}

}// class