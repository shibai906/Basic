package com.zhao.Exception.runtimeexception;

public class YesOrNo {
	
	public void love(String love){
		if(!"爱".equals(love)){
			throw new SundanRuntimeException("一定要爱");
		}
		
	}
	
}
