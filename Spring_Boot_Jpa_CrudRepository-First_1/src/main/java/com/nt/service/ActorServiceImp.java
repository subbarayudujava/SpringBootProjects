package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.Actor;
import com.nt.repository.ActorRepository;

public class ActorServiceImp implements IActorService {
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public String registerActor(Actor actor) {
	
		return null;
	}

	@Override
	public String registarGroup(List<Actor> list) {
		
		return null;
	}

	@Override
	public long fectchingRecordscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<Actor> fetchinhAllactors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean idisAvailable(int aid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Actor> findAllById(Iterable<Integer> aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Actor> fetchingfindbyid(Integer aid) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Actor showActorId(Integer aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateActornumber(Integer aid, Long newmobnumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateActorData(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rigisterOrUpdating(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeActordata(Integer aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeActor(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeActordataFromTable(Integer aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeAllActors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeActorsByid(List<Integer> aid) {
		// TODO Auto-generated method stub
		return null;
	}

}
