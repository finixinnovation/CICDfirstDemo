package com.example.CICDdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CICDdemo.service.firstService;



@RestController
@RequestMapping("/cicd/")
public class firstController {

	@Autowired
	firstService firstservice;
	
	  @GetMapping("test")
	  public String test()
	  {
		  return "success";
	  }
	 
	
	@GetMapping("add/{a}/{b}")
	public ResponseEntity<Integer> getQuestion(@PathVariable ("a") int a,@PathVariable ("b") int b) {
		//return questionService.getQuestion(aid);	
		return firstservice.add(a, b);
	}
}
