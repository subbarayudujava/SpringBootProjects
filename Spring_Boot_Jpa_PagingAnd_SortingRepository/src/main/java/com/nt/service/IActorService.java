package com.nt.service;

import com.nt.entity.Actor;

public interface IActorService {
public Iterable<Actor> showActorsByOrders(Boolean asc,String...properties);
}