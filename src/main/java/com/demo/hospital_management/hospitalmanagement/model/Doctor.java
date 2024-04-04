package com.demo.hospital_management.hospitalmanagement.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PreRemove;
import jakarta.persistence.Table;

import com.demo.hospital_management.hospitalmanagement.enums.Specialization;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "doctor")
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	@Id
	@Column(name = "did", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;

	@Column(name = "dname", nullable = false)
	private String name;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "specialization")
	@Enumerated(EnumType.STRING)
	private Specialization specialization;
	
	@Column(name = "password")
	private String password;

	

//	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
//	private Set<Patient> patient;

}
