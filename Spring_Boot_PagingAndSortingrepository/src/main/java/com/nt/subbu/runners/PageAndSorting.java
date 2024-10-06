package com.nt.subbu.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;

import com.nt.subbu.entiry.Actor;
import com.nt.subbu.service.ActorService;

public class PageAndSorting  implements CommandLineRunner{
	@Autowired
    private ActorService actorService;
	@Override
	public void run(String... args) throws Exception {
		//find AllAssinding order
		actorService.showActorbyorder(true,"aid").forEach(System.out::println);
		//find all desinding order
		actorService.showActorbyorder(false,"name","aid").forEach(System.out::println);
		//--------records or one by one---------
		Page<Actor> page=actorService.showPageRecords(0, 3);
		List<Actor> lit=page.getContent();
		System.out.print("records are:");
		lit.forEach(System.out::println);
		System.out.print("other information of Actors");
		System.out.print("correct page no:"+page.getNumber());
		System.out.print("totalpageno:"+page.getTotalPages());
		System.out.print("get total paage:"+page.getTotalElements());
		System.out.print("this is first page:"+page.isFirst());
		System.out.print("this is last page:"+page.isLast());
	}
  
}
