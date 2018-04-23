package com.zhao.JVM.JVMError;

import java.util.ArrayList;
import java.util.List;

/*
 * 用来对常量池的设置
 * 通过对-XX:PermSize和-XX:MaxPermSize
 */
public class RuntimeConstantPoolOOM {


	public static void main(String[] args) {
		
		/*String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("jav").append("va").toString();
		System.out.println(str2.intern() == str2);*/
		
		testOOM();
		
	}

	/*
	 * 这个在这里看不到效果 VM Args: -XX:PermSize = 10M -XX:MaxPermSize=10
	 * 上面那种方式在8.0中已经删除
	 * @author zh
	 */
	public static void testOOM()
	{
		// 使用List保持着常量池引用，避免Full GC 回收常量池行为
		List<String> list = new ArrayList<String>();
		// 10MB的PermSize在integer范围内足够产生OOM了
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}

}
