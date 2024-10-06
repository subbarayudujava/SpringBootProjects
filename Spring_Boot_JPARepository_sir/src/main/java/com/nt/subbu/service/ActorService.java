package com.nt.subbu.service;

import java.util.List;

import com.nt.subbu.entity.Actor;

public interface ActorService {

	public String deleteAllByIdBatch(List<Integer> Aid);

	public Actor searchByid(Integer aid);
	
     //if actir id details any one give the datails there are not then use
	public List<Actor> searchByActors(Actor actor, boolean order, String... property);
}
