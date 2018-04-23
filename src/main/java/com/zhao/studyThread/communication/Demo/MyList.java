package com.zhao.studyThread.communication.Demo;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private  List<String> list = new ArrayList<>();
	
	public void add(){
		list.add("娇娇");
	}
	
	public int size(){
		return list.size();
	}
	
	
}
