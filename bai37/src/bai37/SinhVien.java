package bai37;

import java.util.Objects;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private Ngay ngaySinh;
	private double diemTB;
	private Lop lop;
	
	public SinhVien(int maSinhVien, String hoTen, Ngay ngaySinh, double diemTB, Lop lop) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public String layTenKhoa()
	{
		return this.lop.getTenKhoa();
	}
	
	public Boolean kiemTraThiDat()
	{
		return diemTB >= 5.0;
	}

	public Boolean ngaySinhKhac(SinhVien svkhac)
	{
		return this.ngaySinh.equals(svkhac.ngaySinh);
	}
	
	
	
}
