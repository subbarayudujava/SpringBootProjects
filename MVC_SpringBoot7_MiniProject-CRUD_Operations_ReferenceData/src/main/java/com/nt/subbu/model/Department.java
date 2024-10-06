package com.nt.subbu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="dept")
public class Department {
	@Id
	private Integer deptno;
	private String Dname;
	private String loc;

}
