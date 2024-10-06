package com.nt.subbu.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@Table(name = "Person_Name")
@Setter
@Getter
@ToString
public class Person implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1",initialValue = 1001, allocationSize = 2,sequenceName = "PID_SQE")
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer pid;
	
	@Column(length = 20)
	private String pName;
	
	@Column(length = 30)
	private String pAddrace;
	
	@OneToMany(targetEntity = PhoneNumbers.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)//here will  "mappedby" also use
	@JoinColumn(name = "person",referencedColumnName = "PID")
	
	private Set<PhoneNumbers> phones;//this is the Assosiative property
   public Person(){
	System.out.print("perenr calss "+this.getClass());
}
	

}
