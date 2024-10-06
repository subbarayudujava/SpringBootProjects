package com.nt.subbu.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Phone_Numbers")
@Setter
@Getter
@ToString
public class PhoneNumbers {
	@Id
	@GeneratedValue
	private Integer regno;

	private Long phoneNo;

	@Column(length = 20)
	private String provider;
	
	@Column(length = 20)
	private String number_Type;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Phone_Numbers", referencedColumnName = "PID")
	private Person person;

	public PhoneNumbers() {
		System.out.print("chiled class:" + this.getClass());
	}
}
