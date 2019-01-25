package com.app.MavenSpringBootPropertiesWithConfigurationProperty.bean;

import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	
	private String city;
	
	private int pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", pincode=" + pincode + "]";
	}
}
