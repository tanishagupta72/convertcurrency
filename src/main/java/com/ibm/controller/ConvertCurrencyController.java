package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.ConvertCurrencyRequest;
import com.ibm.model.ConvertCurrencyResponse;
import com.ibm.service.ConvertCurrencyService;

@RequestMapping("/convertCurrency")
@RestController
public class ConvertCurrencyController {

	@Autowired
	ConvertCurrencyService service;
	
	@GetMapping
	public ResponseEntity<ConvertCurrencyResponse> convertCurrency(@RequestParam String countryCode,@RequestParam double amount)
	{
		ConvertCurrencyRequest req = new ConvertCurrencyRequest(countryCode,amount);
		ConvertCurrencyResponse response =service.convertCurrency(req);
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}
}
