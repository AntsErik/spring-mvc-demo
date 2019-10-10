package com.luv2code.springdemo.mvc;

public class Student {
	
	private String firstName;
	private String lastName;
	
	private String country;
	
//	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
//	
//		//populate country options: used ISO country code.
//		countryOptions = new LinkedHashMap<>();
//		
//		countryOptions.put("EST", "Estonia");
//		countryOptions.put("LV", "Latvia");
//		countryOptions.put("LT", "Lithuania");
//		countryOptions.put("FIN", "Finland");
//		countryOptions.put("SE", "Sweden");
}
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

//
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}
	
	
	
	
	
	

}
