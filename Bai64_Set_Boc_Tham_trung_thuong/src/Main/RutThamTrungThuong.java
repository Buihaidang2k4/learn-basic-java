package Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong {
	Set<String> tapHopPhieuDuThuong  = new HashSet<String>();
	
	public RutThamTrungThuong() {}

	public boolean themPhieu(String giaTri) {
		return this.tapHopPhieuDuThuong.add(giaTri);
	}

 	public boolean xoaPhieu(String giaTri) {
		return this.tapHopPhieuDuThuong.remove(giaTri);
	}
	
	// Kiểm tra có phiếu này hay không
	public boolean kiemTraPhieu(String giaTri) {
		return this.tapHopPhieuDuThuong.contains(giaTri);
	}
	
	// Xóa hết phiếu
	public void xoaHetPhieu() {
		 this.tapHopPhieuDuThuong.clear();;
	}
	
	// Số lượng phiếu
	public int soLuongPhieu() {
		return this.tapHopPhieuDuThuong.size();
	}

	// Rút thăm
	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size());
		
		ketQua = (String) this.tapHopPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	// In tất cả
	public void inTatCa() {
		System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
	}
	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong rutThamTrungThuong = new RutThamTrungThuong();
		do {
			System.out.println("==========================");
			System.out.println("Menu:");
			System.out.println("1. Thêm mã");
			System.out.println("2. Xóa mã");
			System.out.println("3. Kiểm tra mã tồn tại không?");
			System.out.println("4. Xóa hết phiếu");
			System.out.println("5. Số lượng phiếu");
			System.out.println("6. Rút thăm trúng thưởng");
			System.out.println("7. In tất cả");
			System.out.println("0. Thoát");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhập vào mã phiếu dự thưởng: "); 
				String giaTri = sc.nextLine();
				if (luaChon == 1) {
					rutThamTrungThuong.themPhieu(giaTri);
				}else if (luaChon == 2) {
					rutThamTrungThuong.xoaPhieu(giaTri);
				}else if (luaChon == 3) {
					System.out.println("Kiểm tra kết quả: "+rutThamTrungThuong.kiemTraPhieu(giaTri));
				}
			}else if (luaChon == 4) {
				rutThamTrungThuong.xoaHetPhieu();
			}else if (luaChon == 5) {
				System.out.println("Số phiếu dự thượng: "+rutThamTrungThuong.soLuongPhieu());
			}else if (luaChon == 6 ) {
				System.out.println("Thăm trúng thưởng: "+rutThamTrungThuong.rutMotPhieu());
			}else if (luaChon == 7) {
				System.out.println("Các mã dự thưởng: ");
				rutThamTrungThuong.inTatCa();
			}else if (luaChon == 0) {
				return;
			}
			
			
		} while (luaChon!=0);
		
		
		
	}
}
