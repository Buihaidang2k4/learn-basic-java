package QuanLiSV;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;

		do {
			System.out.println("---------Menu---------");
			System.out.println("Chọn chức năng");
			System.out.println(
					"	1. Thêm sinh viên vào danh sách\r\n"
					+ "	2. in danh sách sinh viên ra màn hình\r\n" 
					+ "	3. Kiểm tra xem có rỗng hay không\r\n"
					+ "	4. Lấy ra số lượng sinh viên trong danh sách\r\n" 
					+ "	5. Làm rỗng danh sách sinh viên\r\n"
					+ "	6. Kiểm tra sinh viên có tồn tại trong danh sách hay không dựa vào sinh viên\r\n"
					+ "	7. Xoá một sinh viên trên danh sách dựa vào mã sinh viên\r\n"
					+ "	8. Tìm kiếm tất cả sinh viên dựa trên Tên nhập từ bàn phím.\r\n"
					+ "	9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp\r\n" 
					+ "	0. Thoát khỏi chương trình");
			luaChon = scanner.nextInt();
			scanner.nextLine();

			if (luaChon == 1) {
				//1. Thêm sinh viên vào danh sách
				System.out.println("Nhập mã sinh viên: "); String maSV = scanner.nextLine();
				System.out.println("Nhập họ tên : "); String hoTen = scanner.nextLine();
				System.out.println("Nhập năm sinh : "); int namSinh = scanner.nextInt();
				System.out.println("Nhập điểm trung bình : "); float diemTrungBinh = scanner.nextFloat();
				SinhVien sv = new SinhVien(maSV, hoTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
			} else if (luaChon == 2) {
				//2. in danh sách sinh viên ra màn hình
				System.out.println("----Danh sách sinh viên: --- ");
				dssv.inDanhSachSinhVien();
				
			} else if (luaChon == 3) {
				//3. Kiểm tra xem có rỗng hay không
				System.out.print("Danh sách sv rỗng: ");
				System.out.println(dssv.kiemTraDanhSachRong());
				

			} else if (luaChon == 4) {
				//4. Lấy ra số lượng sinh viên trong danh sách
				System.out.print("Số sinh viên: ");
				System.out.println(dssv.laySoLuongSinhVien());
				
			
			} else if (luaChon == 5) {
				//5. Làm rỗng danh sách sinh viên
				System.out.println("danh sách rỗng");
				dssv.lamRongDanhSach();
			} else if (luaChon == 6) {
				//6. Kiểm tra sinh viên có tồn tại trong danh sách hay không dựa vào sinh viên
				System.out.println("Nhập mã sinh viên: "); String maSV = scanner.nextLine();
				SinhVien sinhVien = new SinhVien(maSV);
				System.out.println("Kiểm tra sinh viên có trong danh sách: "+ dssv.kiemTraTonTai(sinhVien));
			} else if (luaChon == 7) {
				//7. Xoá một sinh viên trên danh sách dựa vào mã sinh viên
				System.out.println("Nhập mã sinh viên: "); String maSV = scanner.nextLine();
				SinhVien sinhVien = new SinhVien(maSV);
				System.out.println("Xoá sinh viên trong danh sách: "+ dssv.xoaSinhVien(sinhVien));
				
			} else if (luaChon == 8) {
				//8. Tìm kiếm tất cả sinh viên dựa trên Tên nhập từ bàn phím.
				System.out.println("Nhập họ tên : "); String hoTen = scanner.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.timKiem(hoTen);
			} else if (luaChon == 9) {
				//9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp
				dssv.sapXepDanhSachGiamDan();
				dssv.inDanhSachSinhVien();
			}

		} while (luaChon != 0);
	}
}
