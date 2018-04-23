package com.zhao.data.structure.implement;

public interface SequentialList<T> {

	void initList();

	int listLength();

	T getNode(int i);

	boolean locateNode(T t);

	int insertList(T t);

	boolean DeleteList(int i);
	
	String toString();

}
