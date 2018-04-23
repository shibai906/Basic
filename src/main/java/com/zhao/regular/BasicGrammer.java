package com.zhao.regular;

public class BasicGrammer {
	
	/*
	 * "^":会匹配行或者字符串的起始位置，有时还会匹配整个文档的起始位置。
	 * "$":会匹配行或字符串的结尾
	 * "\b":不会消耗任何字符只匹配一个位置。反义："\B"
	 * "\d":匹配数组。反义："\D"
	 * "\w":匹配字母、数字、下划线。反义："\W"
	 * "\s":匹配空格
	 * ".":匹配除了换行符以外的任何字符
	 * "[abc]":字符组，匹配包括括号内元素的字符
	 * "*"(贪婪)：重复零次或多次
	 * "+"(懒惰)重复一次或更多次
	 * "?"(占有)重复零次或一次
	 * "{n}"重复n次
	 * "{n,m}"重复n到m次
	 * "{n,}"重复n次或更多次
	 * [\u4e00-\u9fa5] 匹配汉子
	 */
	public static void main(String[] args) {
		
		String email = "找zhaohuan906@163.com";
		System.out.println(email.matches("^[\u4e00-\u9fa5]\\w+@\\w{2,6}.\\w+$"));
		
		String ip = "https://www.baidu.com";
		System.out.println(ip.matches("^https?://w{3}.\\w+.\\w{2,6}$"));
		
		String yonghu = "(赵欢)zhaohuan@174.com";
		System.out.println(yonghu.matches("^\\([\u4e00-\u9fa5\\w]+\\)\\w+@\\w{2,6}.\\w{2,6}$"));
		
		String fanhao = "magnet:?xt=urn:btih:9987403d626d811e533f6780416f1d83c43420e4";
		System.out.println(fanhao.matches("^\\w+:\\?\\w+\\=\\w+:\\w+:\\w+$"));
		
	}
	
}
