package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.subbu.entity.Actor;
@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
