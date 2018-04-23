package com.zhao.noteZhujie;

public @interface Note4 {
	
	int num();
	String str();
	MyEnum1 enu();
	Class cla();
	Note2 note();
	int[] arrs();
	
}

@Note4(num=10,str="string",enu=MyEnum1.A,cla=Demotwo.class,note=@Note2(age=23,name="zhaoha"),arrs={10,8})
class Demotwo{
	
}

enum MyEnum1{
	A,B;
}