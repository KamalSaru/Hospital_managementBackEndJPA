package com.demo.hospital_management.hospitalmanagement.demojunit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CalculatorTest {
	
	/*
	 * Junit testing - java unit testing
	 * test case - whether actual result is matching with expected or not
	 */

	Calculator calculator = new Calculator();
	
	@Test // this tells that it is an single test case
	public void sumTestPositive() {
		int actualResult = calculator.sum(10, 2);
		assertNotNull(actualResult);
		assertEquals(10, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void sumTestNegative() {
		int actualResult = calculator.sum(10, 2);
		assertNotNull(actualResult);
		assertNotEquals(4, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void diffTestPositive() {
		int actualResult = calculator.diff(10, 2);
		assertNotNull(actualResult);
		assertEquals(8, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void diffTestNegative() {
		int actualResult = calculator.diff(10, 2);
		assertNotNull(actualResult);
		assertNotEquals(4, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void mulTestPositive() {
		int actualResult = calculator.mul(10, 2);
		assertNotNull(actualResult);
		assertEquals(20, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void mulTestNegative() {
		int actualResult = calculator.mul(10, 2);
		assertNotNull(actualResult);
		assertNotEquals(4, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void divTestPositive() {
		int actualResult = calculator.div(10, 2);
		assertNotNull(actualResult);
		assertEquals(5, actualResult);
	}
	
	@Test // this tells that it is an single test case
	public void divTestNegative() {
		int actualResult = calculator.div(10, 2);
		assertNotNull(actualResult);
		assertNotEquals(4, actualResult);
	}
}
