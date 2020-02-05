package com.maint.core.exceptions;

public class DaoException extends ServiceException{

	public DaoException (String message){
		super(message);
	}
	
	public DaoException (Exception rootException){
		super(rootException);
	}
}
