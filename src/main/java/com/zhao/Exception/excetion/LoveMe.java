package com.zhao.Exception.excetion;

public class LoveMe {
	
	public void zh(String express) throws KaidiException{
		if(!"爱".equals(express)){
			throw new KaidiException("感情表达错误");
		}
	}
}
