package com.demo.hospital_management.hospitalmanagement.request;

import com.demo.hospital_management.hospitalmanagement.response.AuthenticationResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

	private String username;
	private String password;
	private String role;
}
