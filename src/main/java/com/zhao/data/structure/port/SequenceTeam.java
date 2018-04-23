package com.zhao.data.structure.port;


import com.zhao.data.structure.implement.Team;

public class SequenceTeam<T> implements Team<T> {
	
	private final static int MAXLEN = 10;
	private T[] t = null;
	private int maxSize = 0;
	private int size = 0;
	
	public SequenceTeam(){
		this(MAXLEN);
	}
	@SuppressWarnings("unchecked")
	public SequenceTeam(int ms) { // 这里是初始化队
		if(ms <= 0){
			System.err.println("不要传入错误参数");
		}
		maxSize = ms;
		Object[] obj = new Object[maxSize];
		t = (T[]) obj;
	}
	@Override
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	public boolean isMax(){
		return size == maxSize ? true : false ;
	}
	
	@Override
	public boolean push(T e) {
		if(isMax()){
			System.err.println("队已满,无法添加");
			return false;
		}
		t[size] = e;
		size ++ ;
		return false;
	}
	@Override
	public T pop() {
		if(isEmpty()){
			System.err.println("队空，无法出来新元素");
			return null;
		}
		T tt = t[0];
		for(int i = 0; i < size - 1 ; i++){
			t[i] = t[i+1];
		}
		size -- ;
		return tt;
	}
	@Override
	public T peek() {
		if(isEmpty()){
			System.err.println("队空，无法出来新元素");
			return null;
		}
		return t[0];
	}
	@Override
	public int getIndex(T e) {
		for(int i = 0; i < size; i ++){
			if(e.equals(t[i])){
				return i+1;
			}
		}
		return -1;
	}
	@Override
	public int size() {
		return size;
	}
	public int getStackSize() {
		return maxSize;
	}
	@Override
	public void display() {
		for(int i = 0 ; i < size ; i ++){
			System.out.println(t[i]);
		}
		
	}
	
	
	
	
}
