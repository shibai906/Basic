package com.zhao.noteZhujie;

public @interface Note1 {

}


@interface Note2{
	int age();
	String name();
	// 也可以给默认值  后面加default 加值
	String str() default "String";
}

// 当只有一个值时可以使用value，这样用起来比较方便一些，下面使用时value可以省略
@interface Note3{
	
	String value();
	
}

// 注解可以加在类名上
@Note1
@Note3("Demo")
class Demo{
	
	// 可以加在属性上
	@Note1
	private String name;
	
	// 加在构造器上
	@Note1
	public Demo(){
		
	}
	
	@Note1 // 注解可以加在方法上
	public void demo(){
		@Note2(age=20,name="sdf")
		String name = "lskd";
		
	}
	
}