package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Actor;

public interface IActorService {

	public String registerActor(Actor actor);

	public String registarGroup(List<Actor> list);

	//public String registarGroupOfvalue(Iterable<Actor> list);

	public long fectchingRecordscount();

	public Iterable<Actor> fetchinhAllactors();

	public boolean idisAvailable(int aid);//The Id is available or not only

	public Iterable<Actor> findAllById(Iterable<Integer> aid);//get data number of data by using id

	public Optional<Actor> fetchingfindbyid(Integer aid);

	public Actor showActorId(Integer aid);

	public String updateActornumber(Integer aid, Long newmobnumber);//updating particular data or colunm

	public String updateActorData(Actor actor);//Updating total row At a time

	public String rigisterOrUpdating(Actor actor);// Given data id is Available update otherwise we dont give any id new row is generated

	public String removeActordata(Integer aid);//remove row from the table
	//another way of remove the patiol data

	public String removeActor(Actor actor);

	public String removeActordataFromTable(Integer aid);//delete data by using id when we know id is availbale then only we this method

	public String removeAllActors();//delete all record at a time

	public String removeActorsByid(List<Integer> aid);//delete particular ids depeding on requerment
	

}
