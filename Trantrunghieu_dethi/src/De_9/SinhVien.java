package De_9;

import java.util.Date;
import java.util.Scanner;

public class SinhVien {
	private String hoTen;
	private String maSv;
	private String ngaySinh;
	private String lop;
	
	public SinhVien() {}
	
	public SinhVien(String hoTen, String maSv, String ngaySinh, String lop) {
		super();
		this.hoTen = hoTen;
		this.maSv = maSv;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
	}


	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSv() {
		return maSv;
	}


	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	
	// Nhập thông tin sinh viên
	public void enterInfor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào họ tên: "); hoTen = scanner.nextLine();
		System.out.println("Nhập vào MSV: "); maSv = scanner.nextLine();
		System.out.println("Nhập vào ngày sinh: "); ngaySinh = scanner.nextLine();
		System.out.println("Nhập vào lớp: "); lop = scanner.nextLine();
	}
	
	// Hiển thị thông tin
	 public void hienThiThongTin() {
	        System.out.println("Họ và tên: " + hoTen);
	        System.out.println("MSV: " + maSv);
	        System.out.println("Ngày sinh: " + ngaySinh);
	        System.out.println("Lớp: " + lop);
	 }
	 
	@Override
	public String toString() {
		return "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", lop=" + lop;
	}
	
}
