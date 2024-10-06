package com.nt.subbu.runners;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.entity.EmployeeInfo;
import com.nt.subbu.epository.EmployeeInfoRepository;

@Component
public class Runne implements CommandLineRunner {
	@Autowired
	private EmployeeInfoRepository infoRepository;

	@Override
	public void run(String... args) throws Exception {
		//Save operation
		EmployeeInfo info = new EmployeeInfo();
		info.setEname("Subbarayudu");
		      info.setFriends(List.of("raju", "madhu"));
		      info.setPhoneNo(Set.of(9999999999l, 88888888l));
		      info.setIdDetails(Map.of("Aadhar card", 80020129102l, "pan card", 898989989898l));
	//	System.out.print("save the details" + infoRepository.save(info).getEno() + "id value");
		     //Retriving data from the datble
		Iterable<EmployeeInfo> it=infoRepository.findAll();
		it.forEach(System.out::println);
		
		
	}

}
