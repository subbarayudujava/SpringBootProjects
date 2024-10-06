package com.nt.subbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.nt.subbu.entiry.Actor;
import com.nt.subbu.repository.IMovieRepo;

public class ActorServiceImp implements ActorService {
     @Autowired
     private IMovieRepo iMovieRepo;
	@Override
	public Iterable<Actor> showActorbyorder(Boolean asc, String... property) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, property);
            Iterable<Actor> ite= iMovieRepo.findAll(sort);
		return ite;
	}
	@Override
	public Page<Actor> showPageRecords(Integer pageNo, Integer pageSize) {
		//create pagable object
		   Pageable pagebale=PageRequest.of(pageNo,pageSize);
		   //get give page records
		   Page<Actor> page=iMovieRepo.findAll(pagebale);
		return page;
	}

}
