package com.zhao.JVM.fourReference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class FourRef {
	
	public static void main(String[] args) {
		WeakReference();
	}
	
	public static void softReference(){
		SoftReference<Entity> soft = new SoftReference<Entity>(new Entity());
		soft.get().Method();
		System.gc();
		soft.get().Method();
	}
	public static void WeakReference(){
		WeakReference<Entity> weak = new WeakReference<Entity>(new Entity());
		weak.get().Method();
		System.gc();
		weak.get().Method();
	}
	
}
