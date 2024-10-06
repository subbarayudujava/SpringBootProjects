package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.subbu.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
