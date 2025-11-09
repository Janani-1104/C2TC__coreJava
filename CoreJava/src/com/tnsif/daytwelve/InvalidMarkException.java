//Program to define User defined exception class
package com.tnsif.daytwelve;

public class InvalidMarkException extends Exception{

	public InvalidMarkException() {
		super();
	}

	public InvalidMarkException(String message) {
		super(message);
	}

	
}