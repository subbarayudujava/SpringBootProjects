package com.nt.subbu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.subbu.entity.PorsonDetails;
import com.nt.subbu.repositoruy.PorsonInfoRepo;
@Service("Porson")
public class PorsonService implements IPorsonInfoManage {
       @Autowired
       private PorsonInfoRepo infoRepo;
	@Override
	public String registerPorsonDetails(PorsonDetails info) {
		 
		return infoRepo .save(info).getPid()+"porson details is saved";
	}
	@Override
	public PorsonDetails fetchPorsonDetails(Integer pid) {
		
		return infoRepo.findById(pid).orElseThrow(()->new IllegalArgumentException("invalid pid"));
	}

}
