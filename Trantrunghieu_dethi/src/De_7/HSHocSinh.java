package De_7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HSHocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private String kyHoc;
	private List<HSHocSinh> danhSachHS = new ArrayList<>();

	public HSHocSinh() {
	};

	public HSHocSinh(String hoVaTen, int ngay, int thang, int nam, String queQuan, String lop, String khoaHoc,
			String kyHoc) {
		super(hoVaTen, ngay, thang, nam, queQuan);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
		this.kyHoc = kyHoc;
	}

	public String getLop() {
		return lop;
	}

	public String getKhoaHoc() {
		return khoaHoc;
	}

	public String getKyHoc() {
		return kyHoc;
	}

	// Nhập vào danh sách gồm n học sinh và thêm vào danh sách
	public void nhapVaoNHocSnh() {
		int nhap = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào n: ");
		nhap = sc.nextInt();
		for (int i = 0; i < nhap; i++) {
			HSHocSinh hsHocSinh = new HSHocSinh();
			System.out.println("Nhập hs " + (i + 1) + " :");
			hsHocSinh.nhapThongTinNguoi();
			danhSachHS.add(hsHocSinh);
		}
	}

	// Hiển thị thông tin những học sinh sinh năm 1985 và quê ở Thái Nguyên
	public void hienThi1985VaThaiNguyen() {
		System.out.println("Danh sách học sinh sinh năm 1985 và quê ở Thái Nguyên:");
		for (Nguoi hsHocSinh : danhSachHS) {
			if (hsHocSinh.getNam() == 1985 && hsHocSinh.getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
				System.out.println(hsHocSinh);
			} else {
				System.out.println("Không có hs 1985");
			}
		}
	}

	// Hiển thị danh sách học sinh của lớp 10A1
	public void hienThiHS10A1() {
		System.out.println("\nDanh sách học sinh của lớp 10A1: ");
		for (HSHocSinh hsHocSinh : danhSachHS) {
			if (hsHocSinh.getLop().equalsIgnoreCase("10A1")) {
				System.out.println(hsHocSinh);
			}
		}
	}

	// Hiển thị thông tin về mỗi cá nhân
	public void hienThiThongTin() {
		System.out.println("\nDanh sách hs: ");
		for (HSHocSinh nguoi : danhSachHS) {
			System.out.println(nguoi);
		}
	}

	// Nhập thông tin người
	@Override
	public void nhapThongTinNguoi() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTinNguoi();
		System.out.println("Nhập thông tin lớp: ");
		lop = sc.nextLine();
		System.out.println("Nhập thông tin khoá học: ");
		khoaHoc = sc.nextLine();
		System.out.println("Nhập thông tin kỳ học: ");
		kyHoc = sc.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + " ,lớp= " + lop + " ,khoá học= " + khoaHoc + " ,Kỳ Học= " + kyHoc;
	}

}
