package com.zhao.genericity;

import java.util.ArrayList;
import java.util.List;

public class Arrays<T> {
	
	private Arrays(){
	}
	
	public static <T> void  swap(T[] obj,int i,int j){
		if(i > j){
			throw new QianyigeException("i不能小于j");
		}
		T temp;
		temp = obj[i];
		obj[i] = obj[j];
		obj[j] = temp;
		
	}
	
}
