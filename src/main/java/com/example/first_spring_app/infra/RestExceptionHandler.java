package com.example.first_spring_app.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.first_spring_app.exceptions.EventNotFoundException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	

	@ExceptionHandler(EventNotFoundException.class)
	private ResponseEntity<String> userNotFoundHandler(EventNotFoundException exception) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
	
}
	
	
	
}
