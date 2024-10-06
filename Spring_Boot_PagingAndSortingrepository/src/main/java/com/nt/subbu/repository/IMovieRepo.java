 package com.nt.subbu.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.subbu.entiry.Actor;

public interface IMovieRepo extends PagingAndSortingRepository<Actor, Integer> {

}
