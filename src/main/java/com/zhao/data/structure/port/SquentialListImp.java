package com.zhao.data.structure.port;

import com.zhao.data.structure.implement.SequentialList;

public class SquentialListImp<T> implements SequentialList<T> {
	
	private static final int MAXLEN = 100;
	@SuppressWarnings("unchecked")
	T[] listData = (T[]) new Object[100];
	int ListLen;
	
	/*
	 * 	给初始长度为0
	 * (non-Javadoc)
	 * @see data.structure.port.SequentialList#initList()
	 */
	@Override
	public void initList() { // 初始化这个表
		ListLen = 0;  // 开始表的长度为0
	}
	
	// 返回表的长度
	@Override
	public int listLength() {
		return ListLen;
	}
	
	@Override
	public int insertList(T data) {
		if(this.ListLen >= MAXLEN){
			System.out.println("顺序表已满，不能插入结点");
			return 0;
		}
		this.listData[ListLen++] = data;
		return 1;
	}
	
	public int insertList(int n,T data){
		if(this.ListLen >= MAXLEN){
			System.out.println("顺序表已满，不能插入结点");
			return 0;
		}
		if(n > MAXLEN || this.ListLen+1 < n){
			System.out.println("插入位置不对，现在插入位置最多为"+this.ListLen);
		}
		for(int i = this.ListLen;i >= n; i--){
			this.listData[i] = this.listData[i-1];
		}
		this.listData[n-1] = data;
		ListLen ++;
		return 1;
	}

	@Override
	public T getNode(int i) {
		return listData[i - 1];
	}
	@Override
	public boolean locateNode(T t) {
		for(int i = 0 ; i< this.ListLen ; i ++){
			if(listData[i].equals(t)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean DeleteList(int i) {
		if(i > MAXLEN || i > this.ListLen){
			System.out.println("删除位置错误，请删除"+this.ListLen + "以内的值");
			return false;
		}
		System.arraycopy(listData, i, listData, i-1, this.ListLen - i);
		
		ListLen--;
		return true;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < ListLen; i ++){
			sb.append(listData[i] + "\n");
		}
		return sb.toString();
	}



	



	

	

}
