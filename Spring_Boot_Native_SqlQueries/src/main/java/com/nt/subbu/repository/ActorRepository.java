package com.nt.subbu.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.subbu.entiry.Actor;
@Transactional
public interface ActorRepository extends JpaRepository<Actor, Integer> {
	@Query(nativeQuery = true,value="insert into Data (aid,aname,catagiri,mobnumber)values(AID_SEQ.NEXTVAL,?,?,?")
	@Modifying
	public Integer insertActors(String name, String catagiri, long mobileNo);
	
	@Query(nativeQuery = true,value="SELECT SYSDATE FROM DUAL")
	//@Modifying
	public Date ShowDate();
}
