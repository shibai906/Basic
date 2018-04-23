package com.zhao.cn.Exception;

public class MyScore {
	
	public static int score(int num) throws MyScoreException{
		
		if(num<0||num>100){
			throw new MyScoreException("Score shoud 0-100");
		}else
			return num;
	}
}
