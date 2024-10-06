package com.nt.subbu.model;

import lombok.Data;

@Data
public class Student {
	private Integer sno;
    private String sname;
    private String sadd="hyd";
    private Float avg=0.0f;
       public Student() {
    	   System.out.println("This is 0-param Contractor");
       }
}
