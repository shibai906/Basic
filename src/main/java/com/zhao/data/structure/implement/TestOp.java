package com.zhao.data.structure.implement;


import com.zhao.data.structure.linear.Data;
import com.zhao.data.structure.linear.TestClass;
import com.zhao.data.structure.port.*;

public class TestOp {
	public static void main(String[] args) {
		testLinkedListTeam();
	}
	
	public static void testLinkedListTeam() {
		LinkedListTeam<TestClass> lt = new LinkedListTeam<>();

		for (int i = 0; i < 10; i++) {
			TestClass tc = new TestClass();
			tc.setName("你好" + i);
			tc.setNum(3 + i);
			lt.push(tc);
		}
		TestClass tc = new TestClass();
		tc.setName("你好0");
		tc.setNum(3);
		System.out.println(lt.size());
		System.out.println(lt.peek());
		System.out.println(lt.getIndex(tc));

		lt.display();

	}

	public static void testSequenceTeam() {
		SequenceTeam<TestClass> st = new SequenceTeam<>();

		for (int i = 0; i < 10; i++) {
			TestClass tc = new TestClass();
			tc.setName("你好" + i);
			tc.setNum(3 + i);
			st.push(tc);
		}
		st.pop();
		TestClass tc = new TestClass();
		tc.setName("你好0");
		tc.setNum(3);
		System.out.println(st.size());
		System.out.println(st.getStackSize());
		System.out.println(st.peek());
		System.out.println(st.getIndex(tc));

		st.display();

	}

	public static void testLinkedListInn() {
		LinkedListInn<TestClass> sq = new LinkedListInn<>();

		for (int i = 0; i < 11; i++) {
			TestClass tc = new TestClass();
			tc.setName("你好" + i);
			tc.setNum(3 + i);
			sq.push(tc);
		}
		TestClass tc = new TestClass();
		tc.setName("你好0");
		tc.setNum(3);
		System.out.println(sq.getIndex(tc));

		sq.display();

	}

	public static void testSequenceInn() {
		SequenceInn<TestClass> sq = new SequenceInn<>(11);

		for (int i = 0; i < 11; i++) {
			TestClass tc = new TestClass();
			tc.setName("你好" + i);
			tc.setNum(3 + i);
			sq.push(tc);
		}
		TestClass tc = new TestClass();
		tc.setName("你好0");
		tc.setNum(3);
		System.out.println(sq.getIndex(tc));
		System.out.println(sq.size());
		sq.display();

	}

	public static void testLinkedList() {
		Data da = new Data();
		da.age = 10;
		da.key = "3234";
		da.name = "傻逼被1";
		Data da1 = new Data();
		da1.age = 10;
		da1.key = "3234";
		da1.name = "傻逼被2";
		Data da2 = new Data();
		da2.age = 10;
		da2.key = "3234";
		da2.name = "傻逼被3              a";
		LinkedListImp<Data> lki = new LinkedListImp<>();
		lki.add(da);
		lki.add(da1);
		for (int i = 0; i < 70; i++) {
			Data data = new Data();
			data.age = i;
			data.key = "140" + i;
			data.name = "傻逼" + i;
			lki.add(data);
		}
		lki.add(3, da2);
		lki.toStr();

	}

	public static void testSquentialListImp() {
		SquentialListImp<Data> sq = new SquentialListImp<>();
		sq.initList();

		for (int i = 0; i < 70; i++) {
			Data data = new Data();
			data.age = i;
			data.key = "140" + i;
			data.name = "傻逼" + i;
			sq.insertList(data);
		}
		Data da = new Data();
		da.age = 10;
		da.key = "3234";
		da.name = "傻逼被";
		sq.insertList(3, da);
		sq.DeleteList(3);

		System.out.println(sq.listLength());

		System.out.println(sq.toString());
	}
}
