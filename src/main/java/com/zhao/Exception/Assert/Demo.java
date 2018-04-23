package com.zhao.Exception.Assert;

public class Demo {
	public static void main(String[] args) {
		
		ClassLoader cl = new ClassLoader() {
			@Override
			public void setClassAssertionStatus(String className, boolean enabled) {
				super.setClassAssertionStatus(className, enabled);
			}
		};
		cl.setClassAssertionStatus("Demo", false);
		int x = -1;
		assert x>=0:"这里的数必须是正数";
		System.out.println(x);
		
	}
}
