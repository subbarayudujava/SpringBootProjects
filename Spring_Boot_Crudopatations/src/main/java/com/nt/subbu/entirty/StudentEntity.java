
package com.nt.subbu.entirty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class StudentEntity {
	@Column(name = "sid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer sid;
	private String sname;
	private Float sfee;
	
}
