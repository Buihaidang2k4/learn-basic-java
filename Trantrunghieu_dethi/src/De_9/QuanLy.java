package De_9;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	private  List<TheMuon> danhSachTheMuon = new ArrayList<>();
	private List<SinhVien> danhSachSinhVien = new ArrayList<>();
	
	// Thêm sinh viên vào danh sách
	public void themSinhVien(SinhVien sv) {
        danhSachSinhVien.add(sv);
    }
	
	// Phương thức thêm thông tin mượn sách vào danh sách
    public void themTheMuon(TheMuon theMuon) {
        danhSachTheMuon.add(theMuon);
    }
    

    // Phương thức hiển thị danh sách sinh viên
    public void hienThiDanhSachSinhVien() {
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.hienThiThongTin();
            System.out.println();
        }
    }
    
    // Phương thức hiển thị tên sách mượn cần trả vào cuối tháng
    public void sachCanTraCuoiThang() {
        System.out.println("Sách cần trả vào cuối tháng:");
        // Điều chỉnh vòng lặp và điều kiện cho phù hợp với logic của bạn
        for (TheMuon theMuon : danhSachTheMuon) {
            // Logic kiểm tra sách cần trả vào cuối tháng
            System.out.println("Tên sách:");
        }
    }
	
	
	
}
