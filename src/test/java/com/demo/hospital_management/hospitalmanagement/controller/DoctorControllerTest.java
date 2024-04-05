package com.demo.hospital_management.hospitalmanagement.controller;

import com.demo.hospital_management.hospitalmanagement.dao.DoctorDao;
import com.demo.hospital_management.hospitalmanagement.enums.Specialization;
import com.demo.hospital_management.hospitalmanagement.request.DoctorRequest;
import com.demo.hospital_management.hospitalmanagement.response.BaseResponse;
import com.demo.hospital_management.hospitalmanagement.response.DoctorResponse;
import com.demo.hospital_management.hospitalmanagement.service.DoctorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class DoctorControllerTest {

	@InjectMocks
	private DoctorController doctorController;

	@Mock
	private DoctorService doctorService;

	@Mock
	private DoctorDao doctorDao;
	
	@BeforeEach // before execution of each test case
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	// this is the input request payload
	private DoctorRequest getDoctorRequest() {
		DoctorRequest doctorRequest = new DoctorRequest();
		doctorRequest.setName("yuwiwoms");
		doctorRequest.setEmail("tuiai123@gmail.com");
		doctorRequest.setMobile("9872389289229");
		doctorRequest.setPassword("teusi");
		doctorRequest.setSpecialization(Specialization.CARDIOLOGIST);
		return doctorRequest;
	}
	
	// this is the response object
	private DoctorResponse getDoctorResponse() {
		DoctorResponse doctorResponse = new DoctorResponse();
		doctorResponse.setName("yuwiwoms");
		doctorResponse.setEmail("tuiai123@gmail.com");
		doctorResponse.setSpecialization(Specialization.CARDIOLOGIST.toString());
		return doctorResponse;
	}
	
	@Test
	public void addDoctorTestPositive() {
		Mockito.when(doctorService.addDoctor(Mockito.any())).thenReturn(getDoctorResponse());
		BaseResponse actualResponse = doctorController.addDoctor(getDoctorRequest());
		assertNotNull(actualResponse);
		assertEquals(getDoctorResponse(), actualResponse.getData());
	}
	
	@Test
	public void addDoctorTestNegative() {
		Mockito.when(doctorService.addDoctor(Mockito.any())).thenThrow(new RuntimeException());
		BaseResponse actualResponse = doctorController.addDoctor(getDoctorRequest());
		assertNotNull(actualResponse);
	}
	
	@Test
	public void getDoctorByIdTestPositive() {
		Mockito.when(doctorService.getDoctor(Mockito.any())).thenReturn(getDoctorResponse());
		ResponseEntity<?> actualResponse = doctorController.getDoctorById(123L);
		assertNotNull(actualResponse);
		assertEquals(getDoctorResponse(), actualResponse.getBody());
	}
	
	@Test
	public void getDoctorByIdTestNegative() {
		Mockito.when(doctorService.getDoctor(Mockito.any())).thenThrow(new RuntimeException() );
		ResponseEntity<?> actualResponse = doctorController.getDoctorById(123L);
		assertNotNull(actualResponse);
	}

}
