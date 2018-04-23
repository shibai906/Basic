package com.zhao.data.structure.stack;

public class ProblemlStack {

	static int nDisks = 2;

	public static void main(String[] args) {

		// TODO 自动生成的方法存根
		hanoiProbleml(nDisks, "A", "B", "C");

	}

	public static void doTower(int topN, char from, char inter, char to) {
	
		if(topN == 1){
			System.out.println("把" + from + "移动到" + to);
		}else {
			
			doTower(topN - 1, from , to , inter);
			System.out.println("把" + from + "移动到" + to);
			doTower(topN - 1, inter ,from ,to );
		}
		
	}

	public static int hanoiProbleml(int num ,String left , String mid , String right){
		
		if(num < 1){
			return 0 ;
		}
		
		return process(num , left , mid , right , left , right) ;
	}

	private static int process(int num, String left, String mid, String right, String from, String to) {
		
		if(num == 1){
			if(from.equals(mid) || to.equals(mid)){
				System.out.println("Move 1 from" + from + " to " + to);
			}else{
				System.out.println("Move 1 from" + from + " to " + mid);
				System.out.println("Move 1 from" + mid + "to" + to);
			}
			return 1 ;
		}
		
		if(from.equals(mid) || to.equals(mid)){
			String another = (from.equals(left)||to.equals(left)) ? right : left;
			int part1 = process(num - 1 , left , mid , right , from ,another);
			int part2 = 1;
			return part1 + part2;
		}else{
			int part1 = process(num - 1 , left , mid , right , left , mid ) ;
			int part2 = 1 ;
			System.out.println("Move "+ num + "from" + from + " to " + mid);
			int part3 = 1 ;
			System.out.println("Move " + num + " from" + mid + "to" + to);
			int part4 = process(num - 1 , left , mid , right , mid , right )  ;
			return part1 + part2 + part3 + part4;
		}
		
		
	}
	
}
