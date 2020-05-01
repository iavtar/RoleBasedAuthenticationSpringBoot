package com.iavtar.authservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.iavtar.authservice.response.dto.ServiceResponse;

@ControllerAdvice
public class CustomAccessDeniedHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler({AccessDeniedException.class})
	public ResponseEntity<?> handleAccessDeniedExcpetion(){
		ServiceResponse response = new ServiceResponse();
		response.setCode("401");
		response.setMessage("You are not authorized to access this resource");
		return new ResponseEntity<ServiceResponse>(response, HttpStatus.UNAUTHORIZED);
	}

	
	
}
