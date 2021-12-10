package com.myexample.webapptest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myexample.webapptest.service.FindCurrency;

import junitx.util.PrivateAccessor;
@SpringBootTest
public class TestControllerTest {
	ControllerCurrenecy controller = new ControllerCurrenecy();
	@Test
	void testServlet1() {
		controller.findCurrency("", "");
		assertNotNull( controller.findCurrency("", ""));
		
	}
	
	@Mock
	FindCurrency find;
	
	@Test
	void testServlet2() throws NoSuchFieldException {
		PrivateAccessor.setField(controller,"find",find);
		Mockito.when(find.findCurrenecy("123.45")).thenReturn("One Hundred Twenty Three dollar AND Forty Five cents Only");
		assertNotNull( controller.findCurrency("rajiv", "123.45"));
		
	}
}
