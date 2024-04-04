package com.demo.hospital_management.hospitalmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.demo.hospital_management.hospitalmanagement.enums.Specialization;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class Users {

	@Id
	@Column(name = "uid", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;
}
