package De_4;

import java.util.Scanner;

public class ThiSinh {
	private String soBaoDanh;
	private String hoTen;
	private String diaChi;
	private String dienUuTienKhuVuc;
	
	public ThiSinh() {};
	
	public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String dienUuTienKhuVuc) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.dienUuTienKhuVuc = dienUuTienKhuVuc;
	}

	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienUuTienKhuVuc() {
		return dienUuTienKhuVuc;
	}

	public void setDienUuTienKhuVuc(String dienUuTienKhuVuc) {
		this.dienUuTienKhuVuc = dienUuTienKhuVuc;
	}

	@Override
	public String toString() {
		return "ThiSinh => soBaoDanh: " + soBaoDanh + ", hoTen: " + hoTen + ", diaChi: " + diaChi + ", dienUuTienKhuVuc: "
				+ dienUuTienKhuVuc;
	}
	
	public void enterInfor(Scanner scanner) {
		System.out.println("Nhập số báo danh: "); soBaoDanh = scanner.nextLine();
		System.out.println("Nhập họ tên: "); hoTen = scanner.nextLine();
		System.out.println("Nhập địa chỉ: "); diaChi = scanner.nextLine();
		System.out.println("Nhập diện ưu tiên: "); dienUuTienKhuVuc = scanner.nextLine();
	}
	
	
	
}
