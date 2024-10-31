package De_8;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String queQuan;
	
	public Nguoi() {}

	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}
	
	// Nhập thông tin cá nhân
	public void nhapThongTinCaNhan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên: "); hoTen = sc.nextLine();
		System.out.println("Nhập ngày sinh: "); ngaySinh = sc.nextLine();
		System.out.println("Nhập quê quán: "); queQuan = sc.nextLine();
	}
	
	
	@Override
	public String toString() {
		return "\nhoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan;
	}

	
	
	
}
