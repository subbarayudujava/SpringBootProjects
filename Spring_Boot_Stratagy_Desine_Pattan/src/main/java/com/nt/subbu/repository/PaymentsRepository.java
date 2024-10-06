package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.subbu.entity.BankEntity;
@Repository
public interface PaymentsRepository extends JpaRepository<BankEntity, Long> {

}
