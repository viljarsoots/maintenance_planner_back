package com.maint.core.exceptions;

public class UserException  extends MaintException {

	public UserException(String message){
		super(message);
	}
	
	public UserException(Exception e){
		super(e);
	}
}
