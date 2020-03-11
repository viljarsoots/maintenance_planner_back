package com.maint.core.exceptions;

public class MachineProducerException extends MaintException {

	public MachineProducerException(String message){
		super(message);
	}

	public MachineProducerException(Exception e){
		super(e);
	}
}
