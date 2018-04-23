package com.zhao.data.structure.stack;

public class TestStack {
	
	public static void main(String[] args) {
		testRecursionReverseStack();
	}
	
	public static void testRecursionReverseStack(){
		
		RecursionReverseStack rs = new RecursionReverseStack();
		rs.push(1);
		rs.push(2);
		rs.push(3);
		rs.push(4);
		rs.push(5);
		
		rs.reverse();
		System.out.println(rs.pop());
		System.out.println(rs.pop());
		System.out.println(rs.pop());
		System.out.println(rs.pop());
		System.out.println(rs.pop());
	}
	
}	
