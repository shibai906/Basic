package com.zhao.JVM.JVMError;

import java.util.ArrayList;
import java.util.List;

public class HeapOOm {
	/*
	 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
	 * -Xms:设置堆的最小值
	 * -Xmx:设置堆最大值
	 */
	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while(true){
			list.add(new OOMObject());
		}
		
	}
	
}
