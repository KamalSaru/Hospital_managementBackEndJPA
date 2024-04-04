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
@Table(name = "bill")
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

	@Id
	@Column(name="bid", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="treatment_name", nullable=false)
	private String treatmentName;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="bill_date")
	private Date billDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pid")
	private Patient patient;
}
