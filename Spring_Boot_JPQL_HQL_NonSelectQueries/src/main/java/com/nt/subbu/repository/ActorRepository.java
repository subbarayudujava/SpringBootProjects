package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.subbu.entiry.Actor;

import jakarta.transaction.Transactional;

@Transactional
public interface ActorRepository extends JpaRepository<Actor, Integer> {
	@Query("update Actor set mobnumber=:newMobileNo where aid=:aid")
	@Modifying
	public Integer updateActorMobileNo(long newMobileNo, Integer aid);
}
