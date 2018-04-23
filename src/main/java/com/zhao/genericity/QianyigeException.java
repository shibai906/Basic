package com.zhao.genericity;

public class QianyigeException extends RuntimeException {
	
	private String message;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5486634927773319316L;

	public QianyigeException(){
		super();
	}
	
	public QianyigeException(String message){
		super(message);
	}
	
}
