package com.restful.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.model.Student;

@RestController
public class StudentRestController {
	
	@GetMapping("/student")
	
	public ResponseEntity<Student> ShowDate(){
		Student student = new Student(102,"ZOHAN","nabi@gmail.com","1St Class");
	   return new	ResponseEntity<Student>(student,HttpStatus.OK);
	}

	@GetMapping("/student1")
	
	public Student ShowDate1(){
		Student student1 = new Student(103,"Zoraiz","nabi@gmail.com","1St Class");
	   return  student1  ;  
	}

}
