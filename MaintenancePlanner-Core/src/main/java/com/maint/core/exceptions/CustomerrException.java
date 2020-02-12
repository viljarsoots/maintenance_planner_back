package com.maint.core.exceptions;

public class CustomerrException extends MaintException {

	public CustomerrException(String message){
		super(message);
	}

	public CustomerrException(Exception e){
		super(e);
	}
}
