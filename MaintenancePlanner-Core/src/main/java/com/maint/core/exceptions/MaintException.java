package com.maint.core.exceptions;

import lombok.Getter;
import lombok.Setter;

public class MaintException extends RuntimeException{

	@Getter
	@Setter
	int code;
	
	public MaintException(String message){
		super(message);
	}
	
	public MaintException(Exception e){
		super(e);
	}
}
