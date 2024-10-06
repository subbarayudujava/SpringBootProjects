package com.nt.subbu.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.repository.ActorRepository;
@Component
public class Runners implements CommandLineRunner {
    @Autowired
    private ActorRepository actorRepository;
	@Override
	public void run(String... args) throws Exception {
      System.out.print("=====updating mobile no======");
      Integer inger=   actorRepository.updateActorMobileNo(999999999l,101);
     if(inger!=1) {
    	 System.out.print(inger+"update the monileNo");
     }else {
    	 System.out.print("Id not found");
     }
	}

}
