package com.maint.core.exceptions;

public class ServiceException extends MaintException {
	
	public ServiceException(String message){
		super(message);
	}
	
	public ServiceException(Exception e){
		super(e);
	}
}
