package De_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import De_3.Bao;
import De_3.Sach;
import De_3.TaiLieu;
import De_3.TapChi;

public class TuyenSinh extends ThiSinh{
	List<ThiSinh> danhSachThiSinh = new ArrayList<ThiSinh>();

	// Nhập thông tin về các thi sinh
	public void nhapThongTinThiSinh() {
		int nhap;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập khối(A/B/C): ");
			String loai = sc.nextLine();
			
			switch (loai) {
			case "A":
				Khoi_A khoi_A = new Khoi_A();
				khoi_A.enterInfor(sc);
				danhSachThiSinh.add(khoi_A);
				break;
			case "B":
				Khoi_B khoi_B = new Khoi_B();
				khoi_B.enterInfor(sc);
				danhSachThiSinh.add(khoi_B);
				break;
			case "C":
				Khoi_C khoi_C = new Khoi_C();
				khoi_C.enterInfor(sc);
				danhSachThiSinh.add(khoi_C);
				break;
			default:
				System.out.println("Không có khối bạn nhập !");
				break;
			}
			
			System.out.println("Nhập lựa chọn(1-> nhập tiếp , 0-> dừng)");
			nhap = sc.nextInt();
			sc.nextLine();
		} while (nhap == 1);
	}
	

	// Tìm kiếm theo số báo danh và hiển thị thông tin
	public void timThiSinh() {
		int tim;
		String soBaoDanh;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Nhập số báo danh muốn tìm: ");
		soBaoDanh = scanner.nextLine();
		for (ThiSinh thiSinh : danhSachThiSinh) {
			if (thiSinh.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
				System.out.println("Thí sinh muốn tìm: ");
				System.out.println(thiSinh);
				break;
			}else {
				System.out.println("Không tìm thấy !");
			}
		}
			System.out.println("Bạn muốn tìm tiếp không: (1-> có | 0-> không)");
			tim = scanner.nextInt();
			scanner.nextLine();
		} while (tim >= 1);

	}

}
