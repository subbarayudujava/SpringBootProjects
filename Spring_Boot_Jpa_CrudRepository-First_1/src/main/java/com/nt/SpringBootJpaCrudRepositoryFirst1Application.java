
package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Actor;
import com.nt.service.IActorService;

@SpringBootApplication
public class SpringBootJpaCrudRepositoryFirst1Application {

	public static void main(String[] args) {
		// get ico container
		ApplicationContext ctx = SpringApplication.run(SpringBootJpaCrudRepositoryFirst1Application.class, args);
		IActorService actorService = ctx.getBean("ActorServie", IActorService.class);
		/*try {
		
			Actor actor = new Actor();
			actor.setAid(2);
			actor.setAname("null");
			actor.setCategiri("superHero");
			actor.setMobnumber
			(9898989898L);
			String string = actorService.registerActor(actor);
			System.out.println(actor);
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		} catch (Exception e) {
		
			e.printStackTrace();
		}*/
/*		try {
			List<Actor> actors = List.of(new Actor(1001, "Subbu", "hero", 9090909090L),
					new Actor(1002, "kiran", "super", 8090909090L), 
					new Actor(1003, "muraga", "superhero", 7090909090L),
					new Actor(1004, "ravi", "super super hero",7090909090L),
					new Actor(1005, "m", "Actor",6090909090L));
			String string = actorService.registarGroup(actors);
			System.out.println(string);

			//Another way of command lines runner also we done
			//System.out.println("Count actors:+"+actorService.fectchingRecordscount());
		} catch (Exceptmion exception) {
			exception.printStackTrace();
		}
		try {
			System.out.println("aid is Available:" + actorService.idisAvailable(1));

		} catch (Exception exception) {
			exception.printStackTrace();*/

			((ConfigurableApplicationContext) ctx).close();
		}
	}

