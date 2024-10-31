package De_3;

import java.util.Scanner;

public class Bao extends TaiLieu {
	private String ngayPhatHanh;

	public Bao() {};
	
	public Bao(String maTaiLieu, String tenNXB, String soBanPhatHanh, String ngayPhatHanmh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanmh;
	}

	public String getNgayPhatHanmh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanmh(String ngayPhatHanmh) {
		this.ngayPhatHanh = ngayPhatHanmh;
	}
	
	@Override
	public String toString() {
		return super.toString() + " NgayPhatHanh: "+ ngayPhatHanh;
	}
	
	@Override
	public void enterInfor(Scanner sc) {
		super.enterInfor(sc);
		System.out.println("Nhập ngày phát hành: ");
		ngayPhatHanh  = sc.nextLine();
	}
}
