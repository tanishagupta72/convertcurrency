package com.ibm.model;



public class ConvertCurrencyRequest {

	
	private String countryCode;
	
	
	private double amount;

	public ConvertCurrencyRequest()
	{
		
	}
	public ConvertCurrencyRequest(String countryCode, double amount) {
		super();
		this.countryCode = countryCode;
		this.amount = amount;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
