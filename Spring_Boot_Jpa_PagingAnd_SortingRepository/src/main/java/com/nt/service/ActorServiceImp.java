
package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.ActorRepository;

@Service("ActorServie")
public class ActorServiceImp implements IActorService {
         @Autowired
         ActorRepository actorRepository;
	@Override
	public Iterable<Actor> showActorsByOrders(Boolean asc, String... properties) {
		//Prepating sort order 
		 Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		 //get record by applying sort order 
		Iterable<Actor> iterable= actorRepository.findAll(sort);
		return iterable;
	}
	

}