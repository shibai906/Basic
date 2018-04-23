package com.zhao.cn.File.copy;

import java.io.File;
import java.io.IOException;

/*
 * 
 * File:文件和目录(文件夹)路径名的抽象表示形式
 * 构造方法：
 * 		File(String pathname)：根据一个路径得到File对象
 * 		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * 		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对 
 * 创建功能：
 * 		public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *		public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *		public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 *
 * 重命名功能:public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
 * 
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 * 
 * 判断功能:
 * 		public boolean isDirectory():判断是否是目录
 * 		public boolean isFile():判断是否是文件
 * 		public boolean exists():判断是否存在
 * 		public boolean canRead():判断是否可读
 * 		public boolean canWrite():判断是否可写
 * 		public boolean isHidden():判断是否隐藏
 * 获取功能：
 * 		public String getAbsolutePath()：获取绝对路径
 * 		public String getPath():获取相对路径
 * 		public String getName():获取名称
 *		public long length():获取长度。字节数
 * 		public long lastModified():获取最后一次的修改时间，毫秒值
 * 
 * 获取功能：
 *		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * 		public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class Create {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		// System.out.println(file.mkdir());
		// miker方法，一个或者多个都可以，注意了，小心想创建的变成a.txt文件
		System.out.println(file.createNewFile());
		System.out.println(file.getAbsolutePath());
		File files = new File("E:\\Ps\\尚学堂_肖斌_hadoop视频教程");
		File[] list = files.listFiles();
		for(File lists:list){
			String name = lists.getName();
			String[] na = name.split("_");
			String str = "";
			for(int i = 0;i<na.length;i++){
				if(i != 1&&i!=2){
					if(i == 0){
						str = str.concat(na[i]);
					}else
						str = str.concat("_").concat(na[i]);
				}
			}
			File f = new File(files,str);
			lists.renameTo(f);
		//	String end = name.l
			System.out.println(str);
		}

	}
}
