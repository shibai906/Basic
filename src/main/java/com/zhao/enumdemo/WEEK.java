package com.zhao.enumdemo;

public enum WEEK {
	MONDAY() {
		@Override
		public void show() {
			System.out.println("星期一");
		}
	},TUESDAY() {
		@Override
		public void show() {
			System.out.println("星期二");
		}
	},WEDNESDAY() {
		@Override
		public void show() {
			System.out.println("星期三");
		}
	},THURSDAY() {
		@Override
		public void show() {
			System.out.println("星期四");
		}
	},FRIDAY() {
		@Override
		public void show() {
			System.out.println("星期五");
		}
	},SATURDAY() {
		@Override
		public void show() {
			System.out.println("星期六");
		}
	},SUNDAY() {
		@Override
		public void show() {
			System.out.println("星期日");
		}
	};
	
	
	private WEEK(){
	}
	
	public abstract void show();
}
