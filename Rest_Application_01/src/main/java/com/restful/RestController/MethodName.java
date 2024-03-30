package com.restful.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Member")
public class MethodName {

	@GetMapping("/report")
	public ResponseEntity<String> showReporst() {
		return new ResponseEntity<String>("Get Method This is Get Method", HttpStatus.OK);
		
	}
	
	@PostMapping("/new")
	public ResponseEntity<String> register(){
		return new ResponseEntity<String>("Post Method New Registion Member",HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateMember(){
		return new ResponseEntity<String>("Put Method Update Succes Menber ",HttpStatus.OK);
	}
	
	@PatchMapping("patchupdate")
	public ResponseEntity<String> patchMethod(){
		return new ResponseEntity<>("Pathch Update Method ", HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteMenber(){
		return new ResponseEntity<String>("Delete Method Success Delete Menber",HttpStatus.OK);
	}
}
