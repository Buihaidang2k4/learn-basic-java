package De_3;

import java.util.Scanner;

import De_2.QLCB;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLySach quanLySach = new QuanLySach();
		
		quanLySach.nhapThongTinTaiLieu();
		System.out.println("Nhập mã tài liệu muốn tìm: "); 
		String maTaiLieu = scanner.nextLine();
		quanLySach.timKiemTaiLieu(maTaiLieu);
	
	}
}
