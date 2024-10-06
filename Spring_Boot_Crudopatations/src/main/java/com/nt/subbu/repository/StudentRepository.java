
package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.subbu.entirty.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
