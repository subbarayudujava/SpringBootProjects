package com.nt.subbu.epository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.subbu.entity.EmployeeInfo;
@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

}
