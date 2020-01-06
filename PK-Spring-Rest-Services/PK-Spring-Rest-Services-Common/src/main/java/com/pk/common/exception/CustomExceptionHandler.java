package com.pk.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pk.common.util.Response;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	private String INCORRECT_REQUEST = "INCORRECT_REQUEST";
	private String BAD_REQUEST = "BAD_REQUEST";

	@ExceptionHandler(BusinessException.class)
	public final ResponseEntity<Response> handleUserNotFoundException(BusinessException ex, WebRequest request) {

		Response response = new Response(ex.getMessageCodes(), ex);

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}