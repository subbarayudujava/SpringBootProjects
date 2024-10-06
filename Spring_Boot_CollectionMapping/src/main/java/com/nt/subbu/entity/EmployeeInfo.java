package com.nt.subbu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Employee_info")
@Data
public class EmployeeInfo {
	@Id
	@GeneratedValue
	private Integer eno;
	
	
	@Column(length = 20)
	private String ename;
	
	
	@Column(length = 20, name = "friends_name")//to Store List values
	@ElementCollection//enable the collection mapping
	@CollectionTable(name = "Employee_friends", joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "eno"))
	@OrderColumn(name = "friend_index")//to store list elements index
	@ListIndexBase(1)
	private List<String> friends;
	
	
	@ElementCollection
	@CollectionTable(name = "Employee_PhoneNo",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eno"))
	@Column(name="Phone_Numbers")//to store set emements
	private Set<Long> phoneNo;
	
	@ElementCollection
	@CollectionTable(name = "Employee_IdDetails",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eno"))
	@Column(name="id_details")//to Store map elemnets values
	@MapKeyColumn(name="ID_Type",length = 20)//to store map key elements
	private Map<String, Long> idDetails;

}
