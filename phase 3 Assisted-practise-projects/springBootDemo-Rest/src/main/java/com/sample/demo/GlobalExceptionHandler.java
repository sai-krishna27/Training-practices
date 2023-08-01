package com.sample.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice

//redirect the exceptions to this class
public class GlobalExceptionHandler {

	//customized exception handler 
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception,WebRequest request){
		ErrorMsg details=new ErrorMsg(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(details,HttpStatus.NOT_FOUND);
	}
	
	//All the exceptions which dont have a customized exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception,WebRequest request){
		ErrorMsg details=new ErrorMsg(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(details,HttpStatus.NOT_FOUND);
	}
}
