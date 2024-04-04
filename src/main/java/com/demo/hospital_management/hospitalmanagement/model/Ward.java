package com.demo.hospital_management.hospitalmanagement.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "ward")
@AllArgsConstructor
@NoArgsConstructor
public class Ward {

	@Id
	@Column(name="wid", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="ward_no", nullable=false)
	private String wardNo;
	
	@Column(name="ward_type")
	private String wardType;
	
	@OneToOne(mappedBy = "ward", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Patient patient;
}
