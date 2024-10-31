package De_6;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private int soChungMinh;
	
	public Nguoi() {};
	
	public Nguoi(String hoTen, String ngaySinh, int soChungMinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soChungMinh = soChungMinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getSoChungMinh() {
		return soChungMinh;
	}

	public void setSoChungMinh(int soChungMinh) {
		this.soChungMinh = soChungMinh;
	}

	
	@Override
	public String toString() {
		return "Nguoi: hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", soChungMinh=" + soChungMinh ;
	}
	
	// Nhập vào thông tin người
	public void enterInfor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên: "); hoTen = scanner.nextLine();
		System.out.println("Nhập ngày sinh: "); ngaySinh = scanner.nextLine();
		System.out.println("Nhập so chung minh: "); soChungMinh = scanner.nextInt();
	}
	
	
	
}
