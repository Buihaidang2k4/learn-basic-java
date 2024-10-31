package De_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import De_2.QLCB;

public class QuanLySach extends TaiLieu{
	private List<TaiLieu> danhSachTaiLieu = new ArrayList<TaiLieu>();


	// Nhập thông tin về các tài liệu
	public void nhapThongTinTaiLieu() {
		int nhap;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập loại:(sach/bao/tapchi)");
			String loai = sc.nextLine();
			
			switch (loai) {
			case "sach":
				Sach sach = new Sach();
				sach.enterInfor(sc);
				danhSachTaiLieu.add(sach);
				break;
			case "bao":
				Bao bao = new Bao();
				bao.enterInfor(sc);
				danhSachTaiLieu.add(bao);
				break;
			case "tapchi":
				TapChi tapChi = new TapChi();
				tapChi.enterInfor(sc);
				danhSachTaiLieu.add(tapChi);
				break;
			default:
				break;
			}
			
			System.out.println("Nhập lựa chọn(1-> nhập tiếp , 0-> dừng)");
			nhap = sc.nextInt();
			sc.nextLine();
		} while (nhap == 1);
	}
	

	// Tìm tài liệu theo mã tài liệu và hiển thị thông tin tìm được 
	public void timKiemTaiLieu(String taiLieu) {
		int tim;
		Scanner scanner = new Scanner(System.in);
		do {
			
		for (TaiLieu taiLieu1 : danhSachTaiLieu) {
			if (taiLieu1.getMaTaiLieu().equalsIgnoreCase(taiLieu)) {
				System.out.println("Tài liệu bạn muốn tìm: ");
				System.out.println(taiLieu1);
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
