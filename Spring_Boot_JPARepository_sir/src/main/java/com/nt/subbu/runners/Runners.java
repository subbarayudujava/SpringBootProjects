package com.nt.subbu.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.entity.Actor;
import com.nt.subbu.service.ActorService;

@Component
public class Runners implements CommandLineRunner {
	@SuppressWarnings("unused")
	@Autowired
	private ActorService actorService;

	@Override
	public void run(String... args) throws Exception {

		/*//delete all ids which one we want 
		//1.first way
		System.out.print(actorService.deleteAllByIdBatch(List.of(12, 67, 24, 44)));// here we will insert null values  it will generate null painter exception 
		//2.Another way of 
		//we willinert null values no can generate null painter exception in here
		List<Integer> actors=new ArrayList<>();
		actors.add(31);
		actors.add(20);
		actors.add(null);
		System.out.print(actorService.deleteAllByIdBatch(actors));
		*/

		System.out.print("=======Delete by id reference======");
		/*try {
			//System.out.print(actorService.searchByid(394));
			Actor actor =actorService.searchByid(12);
			System.out.print("proxi:"+actor.getClass());
			System.out.println(actor.getAid(),actor.getAname(),actor.getCategory(),actor.getMobnumber());
			System.out.print(actorService.searchByid(actor));//showing error
		} catch (Exception e) {
			System.out.print("record is not found");
			e.printStackTrace();
		}*/

		try {
			System.out.print("======find by id =======");
			Actor actor2 = new Actor("subbu", "hero", 999l);
			List<Actor> list = actorService.searchByActors(actor2, true, "name");
			System.out.print(list);
		} catch (Exception e) {
			System.out.print("record is not found");
			e.printStackTrace();
		}

	}

}
