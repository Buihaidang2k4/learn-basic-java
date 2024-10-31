package bai37;

/*
 * Xây dựng chương trình java  hỗ trợ quản lí thông tin sinh viên .
 * -Sinh viên bao gồm: Msv,hoten,ngay,thang,nam,DTB,TenLop,Tenkhoa.
 * -Xây dụng lớp và thực hiện các phương thức sau: 
 * a) Cho biết tên khoa mà sinh viên đang theo học 
 * b) Cho biết học sinh có đậu hay không ( điểm trung bình >= 5.0)
 * c) Kiểm tra thông tin sinh viên có ngày sinh giống với ngày sinh 
 * của một sinh viên khác không .
 * 
 * Lưu ý: Viết lớp test để kiểm tra phương  thức constructor và 
 * các phương thức khác 
 */
public class Quanlisv {
	public static void main(String[] args) {
		Lop lop1 = new Lop("12a", "IT");
		Lop lop2 = new Lop("12b", "IC");
		Lop lop3 = new Lop("12c", "IA");
		
		Ngay ngay1 = new Ngay(10, 10, 2010);
		Ngay ngay2 = new Ngay(11, 11, 2011);
		Ngay ngay3 = new Ngay(11, 11, 2011);
		
		SinhVien sv1 = new SinhVien(555, "Hai Dang", ngay1, 4.0, lop1);
		SinhVien sv2 = new SinhVien(666, "Ba SO ", ngay2, 5.0, lop2);
		SinhVien sv3 = new SinhVien(777, "Thi Ngọc", ngay1, 6.0, lop3);
		
		System.out.println("Ten Khoa: ");
		System.out.println("Sv1: "+lop1.getTenKhoa());
		System.out.println("Sv2: "+lop2.getTenKhoa());
		System.out.println("Sv3: "+lop3.getTenKhoa());
		
		System.out.println("Sinh viên đạt: ");
		System.out.println("Sv1: "+sv1.kiemTraThiDat());
		System.out.println("Sv2: "+sv2.kiemTraThiDat());
		System.out.println("Sv3: "+sv3.kiemTraThiDat());
		
		System.out.println("Kiem Tra Ngay sinh: ");
		System.out.println("sv1 sv2: "+ngay1.equals(ngay2));
		System.out.println("sv1 sv3: "+ngay1.equals(ngay3));
		System.out.println("sv2 sv3: "+ngay2.equals(ngay3));
	}
}
