package com.zhao.cn.collectionhefanxing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntFunction;

public class GenericityArr {
	
	public static void main(String[] args) {
		
		//		String[] s = GenericityArr.minmax(String[]::new,"Tom","Dick","Harry");
		//		System.out.println(Arrays.toString(s));
		String[] ss = GenericityArr.minmax("Tom","Dick","Harry");
		System.out.println(Arrays.toString(ss));
	}
	
	
	
	public static <T extends Comparable> T[] minmax(IntFunction<T[]> constr,T...a){
		T[] mm = constr.apply(a.length);
		for(int i =0 ; i < a.length ; i++){
			mm[i] = a[i];
		}
		return mm;
	}
	
	public static <T extends Comparable> T[] minmax(T ...ts ){
		@SuppressWarnings("unchecked")
		T[] mm = (T[]) Array.newInstance(ts.getClass().getComponentType(), ts.length);
		for(int i =0 ; i < ts.length ; i++){
			mm[i] = ts[i];
		}
		return  mm;
	}
	
	
	// 下面这个方法是错误的，以后尽量别用，也不会报错，害死人不偿命
//	public static <T extends Comparable> T[] minmax(T ...ts ){
//		Object[] mm = new Object[2];		
//		return (T[]) mm;
//		
//	}
	
	
	
}
