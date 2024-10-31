package ViDu;

import java.util.Arrays;

import ViDu.SinhVien;

public class Test2 {

	public static void main(String[] args) {
		SinhVien sv1 =  new SinhVien(100," bnh", "lop 1", 9);
		SinhVien sv2 =  new SinhVien(111," anh", "lop 2", 19);
		SinhVien sv3 =  new SinhVien(150,"canh", "lop 3", 99);
		
		SinhVien[] a_sv = new SinhVien[] {sv1,sv2,sv3};
		
		// Mảng ban đầu 	
		System.out.println("Mảng ban đầu:\n"+ Arrays.toString(a_sv));
		// Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Mảng sau khi sắp xếp\n"+Arrays.toString(a_sv));
		
		// Tìm kiếm 
		System.out.println("Tìm kiếm: "+Arrays.binarySearch(a_sv, sv2));
	}
}
