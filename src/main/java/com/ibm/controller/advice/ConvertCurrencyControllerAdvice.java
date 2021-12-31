package com.ibm.controller.advice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibm.exception.ConversionFactorNotFoundException;
import com.ibm.model.ErrorResponse;

@RestControllerAdvice
public class ConvertCurrencyControllerAdvice {

	@ExceptionHandler(ConversionFactorNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleConversionFactorNotFoundException(ConversionFactorNotFoundException e)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse("Error", "Conversion Factor not found", new Date()));
	}
}
