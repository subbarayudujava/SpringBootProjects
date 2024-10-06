package com.nt.subbu.finderBydrunners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.subbu.repository.ActorRepository;

public class FinderBydrunners implements CommandLineRunner {
	@Autowired
     private ActorRepository actorRepository;
	@Override
	public void run(String... args) throws Exception {
		System.out.print("name Actor into");
		actorRepository.finderByAnameEquls("Subbu").forEach(System.out::println);
		
	}

}
