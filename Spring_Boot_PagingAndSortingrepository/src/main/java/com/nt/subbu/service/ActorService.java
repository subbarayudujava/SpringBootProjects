package com.nt.subbu.service;

import org.springframework.data.domain.Page;

import com.nt.subbu.entiry.Actor;

public interface ActorService {
	public Iterable<Actor> showActorbyorder(Boolean asc, String... property);
	
	public Page<Actor> showPageRecords(Integer pageNo,Integer pageSize);
}