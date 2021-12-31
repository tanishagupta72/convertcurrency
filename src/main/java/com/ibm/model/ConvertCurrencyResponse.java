package com.ibm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConvertCurrencyResponse {
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("Converted Currency")
	private String convertedCurrency;
	
	public ConvertCurrencyResponse()
	{
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConvertedCurrency() {
		return convertedCurrency;
	}

	public void setConvertedCurrency(String convertedCurrency) {
		this.convertedCurrency = convertedCurrency;
	}

	public ConvertCurrencyResponse(String status, String convertedCurrency) {
		super();
		this.status = status;
		this.convertedCurrency = convertedCurrency;
	}
	
	
}
