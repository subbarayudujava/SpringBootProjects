package com.nt.subbu.service;

import java.util.Optional;

import com.nt.subbu.entity.User;

public interface Service1 {

	User save(User user);

	Optional<User> findById(Long id);

	Iterable<User> findAll();

	String deleteById(Long id);

	Object getUserById(Long id);

}
