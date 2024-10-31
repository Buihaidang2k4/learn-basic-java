package ViDu;

import ViDu.SinhVien;

public class SinhVien implements Comparable<SinhVien> {
	 @Override
	public String toString() {
		return "SinhVien [hoVaTen=" + hoVaTen + ", maSinhVien=" + maSinhVien + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	private String hoVaTen;
	 private int maSinhVien;
	 private String tenLop;
	 private double diemTrungBinh;
	 
	 
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}


	public int getMaSinhVien() {
		return maSinhVien;
	}


	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}


	public String getHoVaTen() {
		return hoVaTen;
	}


	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}


	public String getTenLop() {
		return tenLop;
	}


	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}


	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}


	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen()
	{
		// Xoá khoảng trắng dư thừa hai đầu
		String s = this.hoVaTen.trim();
		
		// indexOf tìm vị trí xuất hiện đâu tiên trong chuỗi
		if (s.indexOf(" ") >= 0) {
			// Tìm vị trí xuất hiện cuối cùng của ký tự 
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	
	@Override
	public int compareTo(SinhVien o) {
		// <0
		// =0
		// >0
		// Dua trên so sánh trên 
		// Tên: adam,hai A, hai dang
		String tenThis = this.getTen();
		String tenO = o.getTen();
		
		return tenThis.compareTo(tenO);
	}
	 
	 
}
