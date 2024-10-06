package com.nt.subbu.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "Actore_data")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@DynamicInsert(true)
@DynamicUpdate(false)
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer aid;

	@Column(name = "Actor_names", nullable = false, length = 300)
	@NonNull
	private String aname;
	
	@Column(name = "categiri", length = 300)
	@NonNull
	private String category;
	
	@NonNull
	private long mobnumber;
	@Transient
	
	private  String Location;
}
