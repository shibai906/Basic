package com.zhao.io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seralize implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4651558698618748651L;

	public static void main(String[] args) {

		try {
			FileOutputStream fs = new FileOutputStream("E:/迪.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			Seralize seralize = new Seralize();
			oos.writeObject(seralize);
			oos.flush();
			oos.close();
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
