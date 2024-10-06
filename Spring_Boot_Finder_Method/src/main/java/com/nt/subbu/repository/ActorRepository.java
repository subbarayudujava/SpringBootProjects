package com.nt.subbu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.subbu.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
	
	public List<Actor> finderByAnameEquls(String name);
}
