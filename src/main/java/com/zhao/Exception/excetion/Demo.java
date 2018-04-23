package com.zhao.Exception.excetion;

public class Demo {
	public static void main(String[] args) {
		LoveMe lm = new LoveMe();
		
		try {
			lm.zh("爱");
		} catch (KaidiException e) {
			e.printStackTrace();
		}
	}
}
