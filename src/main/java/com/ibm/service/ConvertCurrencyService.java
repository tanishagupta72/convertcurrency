package com.ibm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.exception.ConversionFactorNotFoundException;
import com.ibm.model.ConvertCurrencyRequest;
import com.ibm.model.ConvertCurrencyResponse;

@Service
public class ConvertCurrencyService {

	public ConvertCurrencyResponse convertCurrency(ConvertCurrencyRequest req)
	{
		try {
		String url = "http://manageconversionfactor/conversionFactor/" + req.getCountryCode();
		System.out.println("Target URL :"+url);
		RestTemplate restTemplate = new RestTemplate();
		double conversionFactor = restTemplate.getForObject(url, Double.class);
		
		double convertedAmount = req.getAmount()/conversionFactor;
		return new ConvertCurrencyResponse("Success",convertedAmount + " USD");
		}
		catch(Exception e)
		{
			throw new ConversionFactorNotFoundException();
		}
	}
}
