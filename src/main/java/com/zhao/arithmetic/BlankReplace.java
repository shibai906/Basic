package com.zhao.arithmetic;

public class BlankReplace {

	public static void main(String[] args) {
		System.out
				.println(zipString("jjjjjjxxxxxxxooZLLLLLLLLQQQQQQQQQLLLLLLLLECXXXXXXXIIIIIIIIIhjjyyySSooooooooommmuuEEEEEEEEEnnnnnnnffffffAAAAAllllllllbbbbkkkkkkkkkkkkKKKKKKhhhhhhhhhooooooooooYCCCCCCOOOOOOOOOMMMMMMMMMMiiiiiivvvvvvvWWWWkkkkkkwwwwwwwMmmmmmmmmLLLwwwwwwwkkkjjjjjjttttQQQQQQQQQaaaaaaaFFFFFFFlllllllllggggggggggPPPPPPuuuuuuuuaYYYYYYwQQQFFFFFFFFFFaaaaapXXXXXXXxxxxxxQQQQQQQQQsssssGGGGfffffffddddddpppQQQQQQHHHTTTaaaaaaGGGGGGddyyyyyMhhllllllllllNNNNNNNNUUUWWWWWWLLLLLLLLLYYYYYYYYYYTTKKKKKKKKiiiiiiitttttttXXXXXXXXXLLLHZZZZZZZssssjjJJJEEEEEOOOOOttttttttttBBttttttTTTTTTTTTTrrrrttttRRRRRyyooooooaaaaaaaaarrrrrrrPPPPPPPjjPPPPddddddddddHHHHnnnnnnnnnnSSSSSSSSSSzzHHHHHHHHHddddddDDDzzzhhhhhfffffffffftttttteeeeeeeeEEEEEEEEEaaaaaaccccccccccFFFFFFFF"));
	}

	public static String zipString(String iniString) {
		char[] a = iniString.toCharArray();
		StringBuilder sb = new StringBuilder();
		int j = 0;
		int num = 1;

		for (int i = 0; i < iniString.length() - 1; i++) {
			if (a[i] == a[i + 1]) {
				num++;
			} else {

				sb.append(a[i]);
				sb.append(num);
				num = 1;
			}
		}
		if (a[a.length - 1] == a[a.length - 2]) {
			sb.append(a[a.length - 1]);
			sb.append(num);
		} else {
			sb.append(a[a.length - 1]);
		}
		if (sb.length() > a.length) {
			return iniString;
		}
		return sb.toString();
	}
}
