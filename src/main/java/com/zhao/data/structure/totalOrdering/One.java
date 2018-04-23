package com.zhao.data.structure.totalOrdering;

import java.util.Arrays;

public class One {
	
	private static int i = 1;
	
	public static void main(String[] args) {

		char buf[] = { 'a', 'b' };

		myPerm(buf, 0, buf.length - 1);

	}
	
	public static void myPerm(char[] buf , int start , int end){
		
		if(start == end){
			System.out.println(Arrays.toString(buf) + "  " + (i++));
		}else {
			for(int i = start ; i <= end ; i ++){
				char temp = buf[start] ;
				System.arraycopy( buf, start + 1 , buf, start , i - start);
				buf[ i ] = temp ;
				myPerm(buf, start + 1, end);// 通过start控制要被输出的字符串，对应作用2
				
			}
			
		}
		
	}

	public static void perm(char[] buf, int start, int end) {

		// 这个判断很关键，每次递归到最后的时候，就是START每次都等于END的时候，就是要打印出相 
		//应的全排列字符串的时候，
		if (start == end) {// 这个判断用于递归到最后的时候输出相应的字符串
			for (int i = 0; i <= end; i++) {
				System.out.print(buf[i]);
			}
			System.out.println();

		}
		else {// 这个else块的作用有1：交换第一个位置的字符，比如第一个位置的全排列字符串全部打印后
			// 就把第一个字符和第二个交换；
			// 2：递归打印每次第一个字符串的全排列字符串；
			// 3：每次递归的时候都会传递一个字符串数组，最后三行代码就是控制这个字符串数组不变，意思就是
			// 什么样子传递出去，就什么样子传递回来，一点不能变化，因为最后三行代码不是用于改变
			// 字符串数组的
			for (int i = start; i <= end; i++) {
				char temp = buf[start];// 这三行代码用于控制第一个位置的字符，就是作用1
				buf[start] = buf[i]; // 比如,第一次时的第一个字符的全排列输出完后,
				// 然后把第一个和第二个字符进行交换,交换后,再排列 buf[i]=temp; 
				//刚被交换到第一个位置字符的 全排列字符串
				perm(buf, start + 1, end);// 通过start控制要被输出的字符串，对应作用2
				temp = buf[start];// 这三行是把变换后的字符串顺序进行还原,能够变换字符串顺序的，对应作用3
				// 代码就在递归函数perm()上面三行，用于交换字符串顺序来 buf[start]=buf[i];
				// //交换出所需的全排列字符串
				buf[i] = temp;
			}
		}
	}

}