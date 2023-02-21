package com.rootrsk.social.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	public static ResponseEntity<Object> generateResponse(String message,HttpStatus status,Object resObject){
		Map<String,Object> responseObject = new HashMap<String,Object>();
		responseObject.put("status", status.value());
		responseObject.put("message", message);
		responseObject.put("data",resObject);
		return new ResponseEntity<Object>(responseObject,status);
	}
}
