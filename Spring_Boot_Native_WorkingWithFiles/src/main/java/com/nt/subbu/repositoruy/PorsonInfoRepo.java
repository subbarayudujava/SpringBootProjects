package com.nt.subbu.repositoruy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.subbu.entity.PorsonDetails;
@Repository
public interface PorsonInfoRepo extends JpaRepository<PorsonDetails, Integer> {

}