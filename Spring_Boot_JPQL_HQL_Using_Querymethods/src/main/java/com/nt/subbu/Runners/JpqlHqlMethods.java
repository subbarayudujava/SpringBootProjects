package com.nt.subbu.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.Repository.ActorRepository;
import com.nt.subbu.entity.Actor;

@Component
public class JpqlHqlMethods implements CommandLineRunner {
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.print("========tesing from the Query======");
		try {
			actorRepository.seachActorByCatagiry("hero").forEach(System.out::println);
		} catch (Exception e) {
			System.out.print("Id not found ina data base table");
			e.printStackTrace();
		}
		System.out.print("========tesing from the Query======");
		actorRepository.seachByActorsMobileNo(1, 2, 3);

		System.out.print("========tesing from the Query======");
		actorRepository.seachByActorsByusingcategiri("hero", "comidian", "vilan").forEach(System.out::println);

		System.out.print("========tesing from the Query by using MobileN======");
		Actor actor = actorRepository.getActorDetailsByMobile(1);
		if (actor != null) {
			System.out.print("Actor:" + actor.toString());
		} else {
			System.out.print("mobile number is not there ");

		}
		/*System.out.print("========tesing from the Query by using MobileNo======");
		 Object object=actorRepository.getActorByMobile(99999l);
		 Object result[]=(Object[]) object;
		 for(Object val:result) {
		  System.out.print(val+" ");
		 }*/
		System.out.print("========tesing from the TotalActors======");
		try {
			Integer inte = actorRepository.Actorcount();
		} catch (Exception e) {
			System.out.println("Actors not there");
			e.printStackTrace();
		} /*
			System.out.print("========tesing from the using Aggregation funtion ======");
			 Object result[]=(Object[]) actorRepository.getActordataAggregation();
			 System.out.print("Count of Actors"+result[0]);
			 System.out.print("min of Actors"+result[1]);
			 System.out.print("max of Actors"+result[2]);
			 System.out.print("avg of Actors"+result[3]);
			 System.out.print("sum of Actors"+result[4]);*/
          
          
  		System.out.print("========tesing from the using hightstaid name using subQueryies funtion ======");
          Actor act=actorRepository.getActorSub();
          System.out.print(act);
	}//main

}//class
