package com.myexample.webapptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myexample.webapptest.service.FindCurrency;

/**
 * The Class TestController.
 */
@RestController
public class ControllerCurrenecy {
	
	/** The find. */
	@Autowired
	FindCurrency find;
	
	/**
	 * Find currency.
	 *
	 * @param username the username
	 * @param Currency the currency
	 * @return the response entity
	 */
	@GetMapping("/findcuurency")
	public ResponseEntity<String> findCurrency(@RequestParam String username, @RequestParam String Currency){
		if(username.length()>0 && Currency.length()>0) {
		String finalvalue = find.findCurrenecy(Currency);
		return ResponseEntity.ok(username + " " +finalvalue);
		}else {
			return ResponseEntity.ok("Please pass the username and currency");
		}
	}
}
