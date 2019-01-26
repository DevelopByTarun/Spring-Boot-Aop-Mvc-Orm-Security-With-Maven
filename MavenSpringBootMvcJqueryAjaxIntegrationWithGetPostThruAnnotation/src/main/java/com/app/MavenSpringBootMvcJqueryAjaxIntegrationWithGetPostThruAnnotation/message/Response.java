package com.app.MavenSpringBootMvcJqueryAjaxIntegrationWithGetPostThruAnnotation.message;

import org.springframework.stereotype.Component;

@Component
public class Response {
	
	private String status;
	
	private Object data;

	/**
	 * default constructor
	 */
	public Response() {
		// TODO Auto-generated constructor stub
		System.out.println("Response Default Constructor Is Called");
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
}
