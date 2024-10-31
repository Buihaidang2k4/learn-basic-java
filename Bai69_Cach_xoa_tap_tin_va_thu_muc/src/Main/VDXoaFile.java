package Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class VDXoaFile {
	public static  void xoaFile(File fx) {
		if (fx.isFile()) {
			// Xóa nếu là tập tin
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}else if(fx.isDirectory()) {
			// Lấy các file con
			File[] mangCon = fx.listFiles();
			// Xoa cac file con
			for (File file : mangCon) {
				xoaFile(file);
			}
			//
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			// Xóa bản thân thư mục sau khi xóa File con
			fx.delete();
		}
	}
	public static void xoaFile(File fx) {
		// Xoa files . delete
	}
	
	public static void main(String[] args) {
		// Sử dụng class file
		File f0 = new File("E:\\Java\\Bai69_Cach_xoa_tap_tin_va_thu_muc\\F0");
		File f1 = new File("E:\\Java\\Bai69_Cach_xoa_tap_tin_va_thu_muc\\F1");
		File f2 = new File("E:\\Java\\Bai69_Cach_xoa_tap_tin_va_thu_muc\\vidu.txt");

		
//		f0.deleteOnExit();
	
		/*
		 * f1.deleteOnExit(); // Xóa folder rỗng 
		 * f2.deleteOnExit(); // Xóa được vì là
		 * tập tin 
		 * VDXoaFile.xoaFile(f0);
		 */
		
		// Sử dụng class files xóa tập tin và thư mục
		Path p0 = f0.toPath();
		Path p1 = f1.toPath();
		Path p2 = f2.toPath();
		
		try {
//			Files.deleteIfExists(p0);
			Files.deleteIfExists(p1);
			Files.deleteIfExists(p2);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
