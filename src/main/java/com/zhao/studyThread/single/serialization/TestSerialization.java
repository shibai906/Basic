package com.zhao.studyThread.single.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 序列化
		Entity entity = Entity.getInstance();
		FileOutputStream fosRef = new FileOutputStream(new File("entity.txt"));
		ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
		oosRef.writeObject(entity);
		fosRef.close();
		System.out.println(entity.hashCode());
		// 反序列化
		FileInputStream fisRef =new FileInputStream(new File("entity.txt"));
		ObjectInputStream iosRef = new ObjectInputStream(fisRef);
		Entity en = (Entity) iosRef.readObject();
		iosRef.close();
		fisRef.close();
		System.out.println(en.hashCode());
		
	}
	
}
