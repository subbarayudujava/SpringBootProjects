package com.nt.subbu.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "emp1") 
public class Employee implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "empsql", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length = 25)
	private String ename;
	@Column(length = 25)
	private String job;
	private Float sal;
	private Integer deptno;

}
