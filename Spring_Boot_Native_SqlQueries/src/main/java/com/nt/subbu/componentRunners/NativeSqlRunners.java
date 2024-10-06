package com.nt.subbu.componentRunners;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.repository.ActorRepository;

@Component
public class NativeSqlRunners implements CommandLineRunner {
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public void run(String... args) throws Exception {

		/*Integer count=	actorRepository.insertActors("Subbu", "hero", 6281424454l);
			System.out.println(count==0?"record not inserted":"Recored inserted");
		*/
		System.out.print("======showing corrent date and function====");
		Date da = actorRepository.ShowDate();
		System.out.print("date:"+da);
	}

}
