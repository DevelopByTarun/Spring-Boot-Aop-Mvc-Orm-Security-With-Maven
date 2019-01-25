package com.app.MavenSpringBootAopBeforeAfterAdviceWithPointcutThruAspectJXml.bean;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	
	public AddressBean() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of Address bean is called");
	}

	@NotBlank
	private String city;
	
	@NotBlank
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
