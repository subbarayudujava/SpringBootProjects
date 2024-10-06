package com.nt.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.SQLSelect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
@SQLDelete(sql = "update Employee set account_Status='no' where id=?")
@SQLRestriction(value = "account_status <> 'no'")
@SQLSelect(sql = "select*from Employee where id=?")//here inActive Record also coming
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Column(length = 20)
	private String name;

	@Column(length = 20)
	private String addrace;

	private Long phoneNo;

	private String status;

	private String location;

	private String accountStatus = "yes";

}
