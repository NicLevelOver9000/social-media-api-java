package com.rootrsk.social.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rootrsk.social.util.ResponseHandler;

@RestController
public class UserController {
	
	@RequestMapping(value="/")
	ResponseEntity<Object> home() {
		return ResponseHandler.generateResponse("Welcome to Rootrsk Social Media RestApi", HttpStatus.OK, null);
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	ResponseEntity<Object> login(@RequestBody Object body) {
		
		return ResponseHandler.generateResponse("Loggedin Successfully", HttpStatus.OK, body);
	}
	@ExceptionHandler
	ResponseEntity<Object> exceptionHandler(Exception e){
		return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
	}
}
