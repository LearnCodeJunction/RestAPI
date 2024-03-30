package com.restful.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.model.Customer;

@RestController
@RequestMapping("/Customer")
public class CustomerRestControl {
	
	
	@GetMapping("/reports")
	public ResponseEntity<Customer> showDate(){
		Customer customer = new Customer(101,"NABIALAM","HYD",4525.23F);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}

}
