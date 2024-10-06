package com.nt.subbu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="data")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long ACNO;
   private String Holdername;
   private Float Amount;
   
}
