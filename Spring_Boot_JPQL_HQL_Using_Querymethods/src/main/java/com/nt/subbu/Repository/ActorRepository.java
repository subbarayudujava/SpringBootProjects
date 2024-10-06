package com.nt.subbu.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.subbu.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
	//1.@Query("from Actor where categiri=?1")//Quetion param like this 
	//2.below
	//@Query("from com.nt.subbu.entity.Actor where categiri=?1")
	@Query("from Actor where categiri=:role") //named parametors like this will give

	public Iterable<Actor> seachActorByCatagiry(String role);

	//or
	/*@Query("from Actor where categiri=:role")//named parametors like this will give
	
	public Iterable<Actor> seachActorByCatagiry(@Param("role")String role);
	*/
	@Query("from Actor where mobnumber in(?1,?2,?3)Order by aname")
	public Iterable<Actor> seachByActorsMobileNo(long no1, long no2, long no3);

	@Query("select aid,aname from Actor where categiri in(:cat1,:cat2,:cat3)order by aname")
	public List<Actor> seachByActorsByusingcategiri(String cat1, String cat2, String cat3);

	@Query("from Actor where mobnumber=:no") //no number not match given parametors  so we can use @param
	public Actor getActorDetailsByMobile(@Param("no") long mobnumber);

	@Query("from Actor where mobnumber=:mno")
	public Object getActorByMobile(long mno);

	@Query("select count(*) from Actor")
	public Integer Actorcount();

	@Query("select count(*),mix(aid),max(aid),avg(aid),sum(aid) from Actor")
	public Object getActordataAggregation();
	
	@Query("from Actor where aid=(select max(aid) from Actor)")
	public Actor getActorSub();
}
