
public class Vdu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		
		// Hàm equals => so sánh hai chữ giống nhau có phân biệt hoa thường
		System.out.println("s1 equals s2 :"+s1.equals(s2));
		System.out.println("s1 equals s3 :"+s1.equals(s3));

		System.out.println("s1 equalsIgnoreCase s2 :"+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3 :"+s1.equalsIgnoreCase(s3));
		
		// Nếu dùng hai hàm để so sánh mật khẩu khi đăng nhập dùng hàm nào
		// Dùng equals() vì tài khoản mật khẩu cần sự chính xác
		
		// Hàm compareTo so sánh >,<,= 
		// trả về 0 là bằng nhau ,duong lớn hơn ,âm nhỏ hơn
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";

		
		System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
		System.out.println("sv2 compareTo sv3: "+sv2.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));

		// Hàm compareToIgroneCase => tương tự như compareTo không phân biệt hoa thường
		System.out.println("Sv1 compareToIgnoreCase sv2: "+sv1.compareToIgnoreCase(sv2));
		System.out.println("Sv1 compareToIgnoreCase sv3: "+sv1.compareToIgnoreCase(sv3));
		System.out.println("Sv1 compareToIgnoreCase sv4: "+sv1.compareToIgnoreCase(sv4));

		// Hàm regionMatches => so sánh 1 đoạn 
		String r1 = "TITV.vn";
		String r2 = "TV.vn";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println("r1 vs r2: "+check);
		
		// 0937 456 789
		// 0937 333 888
		String sdt1 = "0937 456 789";
		String sdt2 = "0937 333 888";
		boolean sdt = sdt1.regionMatches(true, 0, sdt2, 0, 4);
		System.out.println("Sdt1 regionMatches std2: "+sdt);
		
		// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
		String sdtString  = "037456789";
		System.out.println(sdtString.startsWith("037"));
		System.out.println(sdtString.startsWith("034"));

		// Hàm endWith => kiểm tra chuỗi kết thúc bằng 
		String tenFile = "hcaiiii.JPG";
		String tenFile1 = "jdsjdj.PDF";
		
		if (tenFile.endsWith(".JPG")) {
			System.out.println("File ảnh");
		}else if (tenFile.endsWith(".PDF")) {
			System.out.println("File PDF");
		}
		 
		
		
	}
}
