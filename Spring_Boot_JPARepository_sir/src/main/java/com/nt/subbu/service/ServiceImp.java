package com.nt.subbu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.subbu.entity.Actor;
import com.nt.subbu.repository.ActorRepository;

@Service
public class ServiceImp implements ActorService {
          @Autowired
          private ActorRepository repository;
	@Override
	public String deleteAllByIdBatch(List<Integer> Aid) {
	List<Actor> actors=	repository.findAllById(Aid);
		int count=actors.size();
		  repository.deleteAllByIdInBatch(Aid);
		return count+"no of recard delete in the batch";
	}
	@Override
	public Actor searchByid(Integer aid) {
		
		//return repository.getById(aid); this is outedated
		return repository.getReferenceById(aid);
	}
	@Override
	public List<Actor> searchByActors(Actor actor, boolean order, String... property) {
	Example example=Example.of(actor);
	 Sort sort=Sort.by(order?Direction.ASC:Direction.DESC, property);
	 List<Actor> list=repository.findAll(sort);
	return list;
	}

}
