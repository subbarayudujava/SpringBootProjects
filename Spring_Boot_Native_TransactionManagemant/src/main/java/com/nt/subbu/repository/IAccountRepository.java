package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.subbu.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Long> {

	@Query(nativeQuery = true, value = "update Account set Amount=Amount-:amount where acono=:srcAcoNo")
	@Modifying
	public Integer withdrawMoney(Long srcAcoNo, Double amount);
	
	@Query(nativeQuery = true, value = "update Account set Amount=Amount+:amount where acono=:destAcoNo")
     @Modifying
	public Integer depositeAmount(long destAcoNo,Double amount);
	
}
