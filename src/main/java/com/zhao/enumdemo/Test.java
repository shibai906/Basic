package com.zhao.enumdemo;

/*
 * * 什么是枚举？
		** 需要在一定的范围内取值，这个值只能是这个范围内中的任意一个。
		** 现实场景：交通信号灯，有三种颜色，但是每次只能亮三种颜色里面的任意一个
	
	* 使用一个关键字 enum
	** enum Color3 {
		RED,GREEN,YELLOW;
	}
	* 枚举的构造方法也是私有的

	* 特殊枚举的操作（了解）
	** 在枚举类里面有构造方法
		** 构造方法里面有参数，需要在每个实例上面都写参数
	** 在枚举类里面有抽象方法
		** 在枚举的每个实例里面都重写这个抽象方法

9、枚举的api的操作
	** name() ：返回枚举的名称
	** ordinal() ：枚举的下标，下标从0开始
	** valueOf(Class<T> enumType, String name) ：得到枚举的对象

	** 还有两个方法，都是这两个方法不在api里面，编译的时候生成两个方法
	*** valueof(String name)  转换枚举对象
	*** values()  获得所有枚举对象数组
 * 
 * 
 */

public class Test {
	public static void main(String[] args) {
		WEEK week = WEEK.MONDAY;
		week.show();
		System.out.println(week.name()+" "+week.ordinal());
		
		String name = "TUESDAY";
		WEEK tuesday = WEEK.valueOf(name);
		System.out.println(tuesday.ordinal());
		
		int thursday = 3;
		WEEK[] weeks = WEEK.values();
		
		WEEK Thurday = weeks[thursday];
		System.out.println(Thurday.name());
		
		
		
	}
}
