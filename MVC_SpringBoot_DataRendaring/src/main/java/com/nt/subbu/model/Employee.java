package com.nt.subbu.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class Employee implements Serializable {
	
	private Integer eid;
	private String ename;
	private Double salary;
	private Boolean vaccinated;

}
