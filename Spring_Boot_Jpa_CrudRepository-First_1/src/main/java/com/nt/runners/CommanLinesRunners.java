package com.nt.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorService;

@Component
public class CommanLinesRunners implements CommandLineRunner {
	@Autowired
	private IActorService actorService;

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Count of Data:" + actorService.fectchingRecordscount());

			/*try{
				Iterable<Actor>ob=actorService.fetchinhAllactors();
			// forEach(actors-> System.out.print(actors));
			
			ob.forEach(actor->{System.out.println(actor);});
			
			System.out.print("------FindAllBId--------");
			
			actorService.findAllById(List.of(1,951,953)).forEach(System.out::print);
			// Another way of findAllByids
			System.out.print("------FindAllBId by using java 8 version--------");
			
			actorService.findAllById(Arrays.asList(1,953)).forEach(actor->System.out.print(actor));
			///here Start findByid
			System.out.print("===find by id ====");
			
			Optional<Actor>ob1=actorService.fetchingfindbyid(1);
			
			if(ob1.isPresent())
			{
				System.out.print("Actor Info :"+ob1.get());
			}
			else
			{
				System.out.print("Actor Id not there:");
			}
			
			System.out.println("2.another way of");
			
			Optional<Actor>ob3=actorService.fetchingfindbyid(1);
			
			Actor s=ob3.orElseThrow(()->new IllegalArgumentException("Actor not Found"))));
			
			System.out.println("Actor into:"+s);
			 
			System.out.println("3..ANOTHER WAY OF FIND");
			
			Optional<Actor> ob2= actorService.fetchingfindbyid(1);
			
			Actor ob3=ob2.isEmpty(new Actor());
			System.out.println("Actor into:"+ob3);
			
			
			System.out.println("4..Another way ti find out");
			
			Optional<Actor > ob4=actorService.fetchingfindbyi1d(1);
			if(ob4.isEmpty())
			{
			  System.out.println("Actor not found");
			}else {
				System.out.println("Actor into:"+ob4.get());
			}
			//here end  findbyid 
			}catch(Exception exception)
			{
				exception.printStackTrace();
				}*/

			/// Single column updating
			/*      System.out.print("----updating Operation-----");
			 System.out.print(actorService.updateActornumber(1, 6281424454l));*/

			//total row updating

			/*System.out.print("------updating total row ----");
			Actor actor =new Actor(1,"chiru","Star",9898989898l);
			System.out.print(actorService.updateActorData(actor));*/

			/*System.out.print("======updating row=======");
			//Actor actor=new Actor(1,"balu","hero",99999999l); // by using id update  only first row
			Actor actor=new Actor("pavan","super Star",9111111111l);//if id we dont give then it will generate new row
			System.out.print(actorService.rigisterOrUpdating(actor));
			*/

			// delete row from the table
			/*System.out.print("========detele operation===");
			System.out.print(actorService.removeActordata(1));
			*/
			//another way of deleting
			/*System.out.print("========detele operation===");
			Actor actor=new Actor(952,"","",9898989898l);
			System.out.print(actorService.removeActor(actor));*/
			// amother way of delete if id available when we knows
			/*System.out.print("=====delete the data=====");
			System.out.print(actorService.removeActordataFromTable(5));*/

			//delete all records in a table at a time
			System.out.print("======delete all recordS AT A TIME=========");
			System.out.print(actorService.removeAllActors());
			//delete actors another ways particular ids 
			System.out.print("=====delete particular id====");
			System.out.print(actorService.removeActorsByid(List.of(1,4,6,7,8)));
		} //try
		catch (Exception exception) {
			exception.printStackTrace();
		} //catch

	}//run

}//class