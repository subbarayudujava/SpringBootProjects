package com.nt.subbu.entiry;

import io.micrometer.common.lang.Nullable;
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
@Table(name = "capgemini")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(name = "Actor_Aname", nullable = false, length = 30)
	@NonNull
	private String name;
	@Column(name = "Actor_Aatagiry", nullable = false, length = 30)
	@NonNull
	private String categiry;
	@Nullable
	private long mNumber;
}
