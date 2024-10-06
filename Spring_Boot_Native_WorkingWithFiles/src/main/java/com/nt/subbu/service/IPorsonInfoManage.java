package com.nt.subbu.service;

import com.nt.subbu.entity.PorsonDetails;

public interface IPorsonInfoManage {
	public String registerPorsonDetails(PorsonDetails info);
	// TO RETRIVE ABOVE DATA 
	public PorsonDetails fetchPorsonDetails(Integer pid);
}
