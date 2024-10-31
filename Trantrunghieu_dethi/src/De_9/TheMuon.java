package De_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soPhieuMuon;
	private String ngayMuon;
	private String ngayTra;
	private int soHieuSach;
	private List<SinhVien> danhSachTheMuon;

	public TheMuon() {
		danhSachTheMuon = new ArrayList<>();
	}

	public TheMuon(int soPhieuMuon, String ngayMuon, String ngayTra, int soHieuSach) {
		super();
		this.soPhieuMuon = soPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.ngayTra = ngayTra;
		this.soHieuSach = soHieuSach;
	}

	public int getSoPhieuMuon() {
		return soPhieuMuon;
	}

	public void setSoPhieuMuon(int soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}

	public String getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public String getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}

	public int getSoHieuSach() {
		return soHieuSach;
	}

	public void setSoHieuSach(int soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	
	// Nhập vào thông tin từng thẻ mượn 
	public void nhapThongTinTheMuon() {
		Scanner sc = new Scanner(System.in);
		int nhap;
		System.out.println("nhập số thẻ mượn: ");
		nhap = sc.nextInt();
		
		for (int i = 0; i < nhap; i++) {
			System.out.println("Nhập the muợn: "+(i+1)+"");
			TheMuon theMuon = new TheMuon();
			theMuon.enterInfor();
			danhSachTheMuon.add(theMuon);
		}
	}
	
	
	// Nhập thông tin
	@Override
	public void enterInfor() {
		Scanner sc = new Scanner(System.in);
		super.enterInfor();
		System.out.println("Nhập số phiếu mượn: ");
		soPhieuMuon = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập ngày mượn: ");
		ngayMuon = sc.nextLine();
		System.out.println("Nhập ngày trả: ");
		ngayTra = sc.nextLine();
		System.out.println("Nhập số hiệu sách: ");
		soHieuSach = sc.nextInt();
	}

	// Phương thức hiển thị thông tin mượn sách
	public void hienThiThongTin() {
		System.out.println("Danh sách the muon: ");
		for (SinhVien sinhVien : danhSachTheMuon) {
			System.out.println(danhSachTheMuon);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " ,Số phiếu mượn: "+soPhieuMuon+" ,Ngày mượn: "+ngayMuon+ " ,Ngày trả: "+ngayTra+" ,Số hiệu sách: "+soHieuSach;
	}

}
