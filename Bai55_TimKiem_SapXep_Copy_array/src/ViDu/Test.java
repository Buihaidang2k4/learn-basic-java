package ViDu;

import java.util.Arrays;

public class Test {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length-1; i>=0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 8, 5, 3, 4 };
		int[] b = new int[15];

		// 
		System.out.println("a ban đầu: "+Arrays.toString(a));
		
		// Sắp xếp
		Arrays.sort(a);
		System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(a));
		
		// Tìm kiếm chỉ tìm được khi mảng đã đc sắp x
		System.out.println(Arrays.binarySearch(a, -1));
		System.out.println(Arrays.binarySearch(a, 4));

		// Điền giá trị
		Arrays.fill(b, 5);
		System.out.println("Sau khi điền giá trị  b: "+Arrays.toString(b));
		
		// Giảm dần
		a = Test.reverse(a);
		System.out.println("a sau khi sắp xếp giảm dần: "+ Arrays.toString(a));
	}
}
