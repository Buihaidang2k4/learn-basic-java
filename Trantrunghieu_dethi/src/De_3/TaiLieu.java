package De_3;

import java.util.Scanner;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNXB;
	private String soBanPhatHanh;
	
	public TaiLieu() {};
	
	public TaiLieu(String maTaiLieu, String tenNXB, String soBanPhatHanh) {
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}


	public String getMaTaiLieu() {
		return maTaiLieu;
	}


	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}


	public String getTenNXB() {
		return tenNXB;
	}


	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}


	public String getSoBanPhatHanh() {
		return soBanPhatHanh;
	}


	public void setSoBanPhatHanh(String soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}


	@Override
	public String toString() {
		return "TaiLieu ==>  maTaiLieu: " + maTaiLieu + ", tenNXB: " + tenNXB + ", soBanPhatHanh: " + soBanPhatHanh;
	}
	
	public void enterInfor(Scanner sc) {
		System.out.println("Nhập mã tài liệu: "); maTaiLieu = sc.nextLine();
		System.out.println("Nhập tên NXB: "); tenNXB = sc.nextLine();
		System.out.println("Nhập só bản phát hành: "); soBanPhatHanh = sc.nextLine();
	}
	
}
