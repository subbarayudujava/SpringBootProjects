package com.nt.subbu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.subbu.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
   //  @Query(value="Select p.pid,p.pName,p.pAddrace,ph.regno,ph.phoneNo,ph.provider,ph.number_Type from Person p inner join p.phones ph")
    // @Query(value="Select p.pid,p.pName,p.pAddrace,ph.regno,ph.phoneNo,ph.provider,ph.number_Type from Person p right join p.phones ph")
   //  @Query(value="Select p.pid,p.pName,p.pAddrace,ph.regno,ph.phoneNo,ph.provider,ph.number_Type from Person p left join p.phones ph")
     @Query(value="Select p.pid,p.pName,p.pAddrace,ph.regno,ph.phoneNo,ph.provider,ph.number_Type from Person p Full join p.phones ph")

      @Modifying
	public List<Object[]> fechDatausingJoinsByParents();
}
