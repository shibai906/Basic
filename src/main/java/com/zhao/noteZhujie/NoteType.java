package com.zhao.noteZhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 这里主要是加条件，选择只能在类上、方法上等注释，编译时编译到那
 */
/*
 * TYPE 指只能在类上添加
 * METHOD 指只能在方法上添加
 * FIELD 指只能在属性上添加
 */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) 
public @interface NoteType {

}

@NoteType
class TypeDemo{
	@NoteType
	private String name;
	
}


/*
 * 这里有三个类型
 * 	源代码文件(SOURCE):注解只在源代码中存在，当编译时就被忽略了
 * 	字节码(CLASS):注解在源代码中存在，然后编译时会把信息放到class文件，但JVM在
 * 		加载类时，会忽略注解！
 * 	JVM中（RUNTIME）：注解在源代码、字节码文件中存在，并且在JVM加载类时，会把注解加载到JVM内存中（它是唯一可反射注解！）
 */
@Retention(RetentionPolicy.RUNTIME)
@interface TypePlace{
	
}

