package com.ty.revision.comparatorassign;

public class EnterProperInput extends Exception{
	
	public EnterProperInput(String str) {
		super(str);
	}
	@Override
	public String getMessage() {
		return "enter proper one";
		
	}
}
