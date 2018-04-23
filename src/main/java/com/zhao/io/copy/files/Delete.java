package com.zhao.io.copy.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 失败906
 * @version 1.0
 * 
 *          在用IO做递归时，特别注意要传给的姓名
 * 
 * 
 * 
 */

public class Delete {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\java1");
		File f1 = new File("E:\\java1");
		del(f, f1);
	}

	private static void del(File f, File f1) throws IOException {
		
		//别人做得方法
		/*// 判断该File是文件夹还是文件
		if (srcFile.isDirectory()) {
			// 文件夹
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			// 获取该File对象下的所有文件或者文件夹File对象
			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFolder(file, newFolder);
			}
		} else {
			// 文件
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}*/

		// 自己做得方法
		File[] files = f.listFiles();

		for (File file : files) {
			if (file.isDirectory()) {
				File newFile = new File(f1, file.getName());
				f1.mkdirs();
				del(file, newFile);
			} else {
				if (file.getName().endsWith(".java")) {
					File newFile = new File(f1, file.getName());
					f1.mkdirs();
					copy(file, newFile);
				}
			}

		}
	}

	private static void copy(File file, File file2) throws IOException {
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(file2));

		int len = 0;
		byte[] b = new byte[1024];
		while ((len = bi.read(b)) != -1) {
			bo.write(b, 0, len);
		}
		bi.close();
		bo.close();
	}
}
