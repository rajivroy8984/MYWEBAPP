package com.myexample.webapptest.service.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class FindCurrencyImplTest {
	
	FindCurrencyImpl testStub = new FindCurrencyImpl();
	
	@Test
	void testServlet1() {
		assertNotNull( testStub.findCurrenecy("123.45"));
		
	}
	
	@Test
	void testServlet2() {
		assertNotNull( testStub.findCurrenecy("1000"));
		
	}
	
	
	@Test
	void testServlet3() {
		assertNotNull( testStub.findCurrenecy("1"));
		
	}

	
	@Test
	void testServlet4() {
		assertNotNull( testStub.findCurrenecy("sdsd"));
		
	}

}
