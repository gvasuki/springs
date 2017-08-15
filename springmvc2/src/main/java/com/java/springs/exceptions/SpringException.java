package com.java.springs.exceptions;

public class SpringException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -233890009960004845L;

	private String exceptionMsg;

	public SpringException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	

}
