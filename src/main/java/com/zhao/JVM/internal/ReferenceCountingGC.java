package com.zhao.JVM.internal;

public class ReferenceCountingGC {
	
	public Object instance = null ;
	private static final int _1MB = 1024*1024;
	/*
	 * 这个成员属性的唯一意义就是占点内存，以便在GC日志中看清除是否被回收过
	 */
	private byte[] bigSize = new byte[2 * _1MB] ;
	
	public static void main(String[] args) {
		testGC();
	}
	
	public static void testGC(){
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		
		// 假设在这行发生GC，objA和objB是否能被回收？
		System.gc();
	}
	
	
}
