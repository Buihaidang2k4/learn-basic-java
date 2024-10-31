package De_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachSan extends Nguoi {
	private int soNgayTro;
	private String loaiPhongTro;
	private double giaPhong;
	private List<KhachSan> dsKhachTro;
	
	public KhachSan() {
		dsKhachTro = new ArrayList<>();
	}
	
	
	 public KhachSan(String hoTen, String ngaySinh, int soCMND, int soNgayTro, String loaiPhongTro, double giaPhong) {
	        super(hoTen, ngaySinh, soCMND);
	        this.soNgayTro = soNgayTro;
	        this.loaiPhongTro = loaiPhongTro;
	        this.giaPhong = giaPhong;
	  }
	

	 // Nhập thông tin
	 @Override
	public void enterInfor() {
		 Scanner sc = new Scanner(System.in);
		 super.enterInfor();
		 System.out.println("Số ngày trọ: "); soNgayTro = sc.nextInt(); 
		 sc.nextLine();
		 System.out.println("Loại phòng tro: "); loaiPhongTro = sc.nextLine();
		 System.out.println("Giá phòng: "); giaPhong = sc.nextDouble();
	 }
	 
	 
	// nhập tin về các khác thuê trọ 
	public void nhapThongTin() {
		System.out.println("Nhập vào n khách trọ: ");
		Scanner scanner = new Scanner(System.in);
		int nhap  = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < nhap; i++) {
			System.out.println("Nhập khách "+(i+1)+": ");
			KhachSan khachSan = new KhachSan();
			khachSan.enterInfor();
			dsKhachTro.add(khachSan);
		}
	}
	
	
	// Số tiền khách hàng cần phải trả thuê phòng
	public double tinhTienTro() {
		return soNgayTro*giaPhong;
	}
	
	// Tính tiền
	public String tienPhaiTra(int soCMND) {
		double soTienPhaiTra = 0;
		for (KhachSan khachSan : dsKhachTro) {
			if (khachSan.getSoChungMinh() == soCMND) {
				System.out.println(khachSan);
				soTienPhaiTra = khachSan.tinhTienTro();
			}
		}
		System.out.println("Tiền trọ: ");
		return soTienPhaiTra + "vnđ";
	}
	
	
	// Hiển thị thôgn tin các khách trọ
	public void printKhachTro() {
		int a=0;
		for (KhachSan khachSan : dsKhachTro) {
			a++;
			System.out.print("Khách "+a+" :");
			System.out.println(khachSan);
		}
	}

	
	// Xóa thông tin về một khách trọ
//	public void xoaThongTinKhachTro() {
//	    Scanner scanner = new Scanner(System.in);
//	    System.out.println("Nhập số CMND của khách muốn xóa: ");
//	    int soCMNDXoa = scanner.nextInt();
//	    scanner.nextLine(); // Đọc bỏ dòng new line
//	    
//	    for (int i = 0; i < dsKhachTro.size(); i++) {
//	        if (dsKhachTro.get(i).getSoChungMinh() == soCMNDXoa) {
//	            dsKhachTro.remove(i);
//	            System.out.println("Thông tin của khách đã được xóa.");
//	            return;
//	        }
//	    }
//	    System.out.println("Không tìm thấy khách hàng với số CMND " + soCMNDXoa);
//	}
//	
	// Xóa thông tin về một khách trọ
	public void xoaThongTinKhachTro() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Nhập số CMND của khách muốn xóa: ");
	    int soCMNDXoa = scanner.nextInt();
	    scanner.nextLine(); // Đọc bỏ dòng new line
	    
	    boolean found = false;
	    for (KhachSan khachSan : dsKhachTro) {
	        if (khachSan.getSoChungMinh() == soCMNDXoa) {
	            dsKhachTro.removeIf(khach -> khach.getSoChungMinh() == soCMNDXoa);
	            found = true;
	            break;
	        }
	    }
	    if (found) {
	        System.out.println("Thông tin của khách đã được xóa.");
	    } else {
	        System.out.println("Không tìm thấy khách hàng với số CMND " + soCMNDXoa);
	    }
	}
	
	@Override
	public String toString() {
		return "Số ngày tro= "+soNgayTro+ " ,Loại phòng= "+loaiPhongTro + " ,Giá phòng= "+giaPhong+" " + super.toString() ;
	}
	
	
	
}
