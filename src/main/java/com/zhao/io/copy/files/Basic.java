package com.zhao.io.copy.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Basic {
	public static void main(String[] args) throws IOException {
		File oldFile = new File("D:\\java1\\Static");
		File newFile = new File("E:\\java1\\Static");

		if (!newFile.exists()) {
			newFile.mkdirs();
		}

		File[] files = oldFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isFile() && pathname.getName().endsWith(".java");
			}
		});

		for (File file : files) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					new File(newFile, file.getName().substring(0, file.getName().length() - 5).concat(".jdk"))));
			String str = null;
			while((str = br.readLine())!=null){
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
			
			br.close();
			bw.close();
		}

	}
}
