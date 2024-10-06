
package com.nt.subbu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class BankEntity {
	@Column
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	 private Long id;
	 private Double amount;
	 private String type;
}
