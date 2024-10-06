package com.nt.subbu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "Actore")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer aid;

	@Column(name = "Actor_names", nullable = false, length = 30)
	@NonNull
	private String name;
	
	@Column(name = "categiri", length = 30)
	@NonNull
	private String categorys;
	
	@NonNull
	private long mobnumber;
}
