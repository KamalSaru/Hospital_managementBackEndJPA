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

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "patient")
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	
	@Id
	@Column(name="pid", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="pname", nullable=false)
	private String patientName;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="admitted_reason")
	private String admittedReason;
	
	@Column(name="admitted_date")
	private Date admittedDate;
	
	@Column(name="discharged_date")
	private Date dischargedDate;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="wid")
	private Ward ward;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@JoinColumn(name="did")
	private Doctor doctor;
	
	//@OneToMany(mappedBy = "patient", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//private Set<Bill> bill = new HashSet<>();

}
