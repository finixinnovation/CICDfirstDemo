package com.example.CICDdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class firstService {

	/*
	 * public static int add(int a) { // TODO Auto-generated method stub return a; }
	 */

	
	public ResponseEntity<Integer> add(int a,int b) {
		// TODO Auto-generated method stub
		int result=0;
		try
		{
			 result = a+b;
		return new ResponseEntity<>(result,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
	}
}
