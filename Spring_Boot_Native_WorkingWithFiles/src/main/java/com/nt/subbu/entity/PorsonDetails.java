package com.nt.subbu.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class PorsonDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@Column(length = 30)
	private String pName;
	private LocalDateTime ldt;
	private Boolean married;
	@Lob
	private byte[] Photo;
	@Lob
	private char[] resume;

}
