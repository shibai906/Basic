package com.zhao.io.FinallyException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args){

		InputStreamReader in = null;
		Exception ex = null;
		try {
			in = new InputStreamReader(new FileInputStream("lkjsd"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				if (ex == null)
					e.printStackTrace();

			}
		}

	}
}
