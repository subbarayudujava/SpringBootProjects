package com.nt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Serializable> {

	
}