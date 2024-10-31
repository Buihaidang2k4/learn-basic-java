import java.util.Iterator;
import java.util.Scanner;

public class VDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi");
		s = scanner.nextLine();
		System.out.println("-----------");
		
		// Hàm length()
		System.out.println(s.length());
		int doDai = s.length();
		
		// charArt(vi tri ) ==> lấy ra một ký tự tại một vị trí
		for (int i = 0; i < doDai; i++) {
			System.out.println("Vị trí "+i+" :"+s.charAt(i));
		}
		
		// getChars(bắt dầu,kết thúc,mảng lưu dữ liệu,vị trí bắt đầu lưu của
//		mảng)
//		char[] arrayChar = new char[100];
//		s.getChars(2, 4, arrayChar, 0);
//		for(int i=0;i< arrayChar.length ;i++)
//		{
//			System.out.println("Giá trị của mảng tại "+i+" là:"+arrayChar[i]);
//		}
		
		// getBytes() => có 3 cách ,lấy ra giá trịcủa các ký tự thành một mảng
		// In ra số theo bảng mã ascii
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}
