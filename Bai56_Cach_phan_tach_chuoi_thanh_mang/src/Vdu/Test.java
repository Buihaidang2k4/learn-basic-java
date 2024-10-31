package Vdu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chao anh em, tui là anna";

		// Hàm cắt phần tử bằng dấu phẩy
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));

		String s2 = "Xin chao anh em, tui là anna. Tôi là an";
		
		// Hàm cắt phần tử bằng cả dấu phẩy và dấu chấm
		String[] c = s.split("\\,|\\.");
		System.out.println(Arrays.toString(c));

		
		String s3 = "Xin chao anh";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Tên: "+ d[d.length-1]);
	}
}
