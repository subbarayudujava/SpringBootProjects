package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.subbu.entity.PhoneNumbers;


public interface IPhoneNumber extends JpaRepository<PhoneNumbers, Integer> {
      @Query(value="Select * from Phone_Numbers where Person_id=:pid",nativeQuery = true)
      @Modifying
      public Integer deleteAllPhonesFromTheTable(Integer pid);
}
