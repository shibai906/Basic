package com.zhao.studyThread.single.staticChunk;

public class TestStaticChunk {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i ++ ){
			ThreadA ta = new ThreadA();
			ta.start();
		}
		
	}
	
}
