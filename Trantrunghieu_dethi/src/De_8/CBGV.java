package De_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CBGV  extends Nguoi{
	private double luongCung;
	private double thuong;
	private double phat;
	private double luongThucLinh;
	private List<CBGV> dsNguoi = new ArrayList<>();
	
	
	public CBGV() {}

	public CBGV(double luongCung, double thuong, double phat, double luongThucLinh) {
		super();
		this.luongCung = luongCung;
		this.thuong = thuong;
		this.phat = phat;
		this.luongThucLinh = luongThucLinh;
	}
	
	// nhập thông tin
		@Override
		public void nhapThongTinCaNhan() {
			Scanner sc = new Scanner(System.in);
			super.nhapThongTinCaNhan();
			System.out.println("Luong cứng: "); luongCung = sc.nextDouble();
			System.out.println("Thưởng: "); thuong = sc.nextDouble();
			System.out.println("Phạt: "); phat = sc.nextDouble();
			sc.nextLine();
		}
	
	// Nhập thông tin và thêm vào mảng 
	public void nhapTatCaTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			CBGV Cbgv = new CBGV();
			System.out.println("Nhập tt "+(i+1)+" :");
			Cbgv.nhapThongTinCaNhan();
			dsNguoi.add(Cbgv);
		}
	}
	
	
	
	
	// Tính lương thực lĩnh 
	public double luongThucLinh() {
		return luongCung + thuong - phat;
	}
	
	// Hiển thị tất cả
	public void hienThi() {
		System.out.println("Danh sách CBGV: ");
		for (CBGV cbgv : dsNguoi) {
			System.out.println(cbgv);
		}
	}
	
	// hiển thị danh sách cán bộ LTL >= 8tr
	public void inDanhSachLuong8trieu() {
		System.out.println("Danh sách CBGV lương >= 8tr: ");
			for (CBGV cbgv : dsNguoi) {
				if (cbgv.getLuongThucLinh() >= 8000000) {
					System.out.println(cbgv);
				}
			}
	}
	
	// Lấy lương thực lĩnh
	public double getLuongThucLinh() {
		return luongThucLinh;
	}
	
	// Hiển thị thông tin khi in ra
	@Override
	public String toString() {
		return super.toString() + " ,luongCung= "+luongCung+" ,Thuong= "+thuong+" ,Phat= "+phat+" ,LuongThucLinh= "+(luongThucLinh = luongThucLinh());
	}
	
}
