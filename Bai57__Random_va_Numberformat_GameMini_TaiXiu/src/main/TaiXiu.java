package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * 
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn
 * hoặc bằng số tiền họ có
 * Luật chơi: 
 * 
 * có 3 viên xúc xắc. Mỗi mỗi xúc xắc có 6 mặt có giá trị từ 1-6
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = Giá trị xx1 + xx2 + xx3
 * 1. Nếu tổng = 3 hoặc 18 => cái ăn hết , 	người chơi thua
 * 2. Nếu tổng = (4-10) <-> xỉu => Nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => Nếu người chơi đặt tài thì người chơi thắng, ngược lại thua
 */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi", "VN");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		
		int luaChon  = 0;
		do {
			System.out.println("\n----------Mời Bạn Lựa Chọn -------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn (phím bất kỳ) để thoát.");
			luaChon = sc.nextInt();
			
			if(luaChon ==1)
			{
				// Đặt cược
				System.out.println("*** BẮT ĐẦU CHƠI: ");
				System.out.println("****** Tài khoản của bạn : "+numf.format(taiKhoanNguoiChoi)+" ,bạn muốn cược bao nhiêu? ");
				double datCuoc = 0;
				do {
					System.out.println("****** Đặt cược( 0<số tiền cược<= "+numf.format(taiKhoanNguoiChoi)+" :");
					datCuoc = sc.nextDouble();
				}while(datCuoc<=0 || datCuoc>=taiKhoanNguoiChoi);
				
				// Chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("****** Chọn 1 <=> Tài hoặc 2 <=> Xỉu");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				// Tung xúc xắc 
				Random xucXac = new Random();

				int giatri1 = xucXac.nextInt(5)+1;
				int giatri2 = xucXac.nextInt(5)+1;
				int giatri3 = xucXac.nextInt(5)+1;
				int tong = giatri1+giatri2+giatri3;

				// Tính toán kết quả
				System.out.println("Kết quả: "+giatri1+" + "+giatri2+" + "+giatri3);
				if(tong == 3 || tong == 18)
				{
					taiKhoanNguoiChoi-= datCuoc;
					System.out.println("****** Tổng là: "+tong+" => Nhà cái ăn hết, bạn đã thua");
					System.out.println("****** Tài khoản của bạn là : "+numf.format(taiKhoanNguoiChoi));
				}else if (tong>=4 && tong<=10) {
					System.out.println("****** Tổng là: "+tong+" => Xỉu");
					if(luaChonTaiXiu == 2)
					{
						taiKhoanNguoiChoi+= datCuoc;
						System.out.println("****** Bạn đã thắng cược : ");
						System.out.println("****** Tài khoản của bạn là : "+numf.format(taiKhoanNguoiChoi));
					}else {
						taiKhoanNguoiChoi-= datCuoc;
						System.out.println("****** Bạn đã thua cược : ");
						System.out.println("****** Tài khoản của bạn là : "+numf.format(taiKhoanNguoiChoi));
					}
				}else {
					System.out.println("****** Tổng là: "+tong+" => Tài");
					if(luaChonTaiXiu == 1)
					{
						taiKhoanNguoiChoi+= datCuoc;
						System.out.println("****** Bạn đã thắng cược : ");
						System.out.println("****** Tài khoản của bạn là : "+numf.format(taiKhoanNguoiChoi));
					}else {
						taiKhoanNguoiChoi-= datCuoc;
						System.out.println("****** Bạn đã thua cược : ");
						System.out.println("****** Tài khoản của bạn là : "+numf.format(taiKhoanNguoiChoi));
					}
				}
				
			
			
			}
				
		}while(luaChon == 1);
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	