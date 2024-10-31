
public class VDu {
	public static void main(String[] args) {
		String s1 = "tiTv";
		String s2 = ".Vn";
		
		String s3 = s1 + s2;
		// Hàm concat => nối chuỗi
		String s4 = s1.concat(s2);
		System.out.println("S3 + "+s3);
		System.out.println("S4 + "+s4);
		
		// Hàm replace =>  thay đổi
		String s5 = "Tung.tttt";
		String s6 = s5.replaceAll("Tung", "TITV");
		System.out.println("S6 + "+s6);
		
		//  toLowerCase => Chuyển về viết thường
		// toUpperCase =>  Chuyển về viết hoa
		String s7  =s3.toLowerCase();
		String s8  = s3.toUpperCase();
		System.out.println("S7 + "+s7);
		System.out.println("S8 + "+s8);
	
		// trim() => xoá khoảng trắng thừa ở đầu chuỗi
		String s9 = "  xin chao   anhh   ";
		System.out.println(s9.trim());
	
		// substring() => hàm cắt chuỗi
		String s10 = "chao hshshshhshs ccc";
		String s11 = s10.substring(5);
		String s12 = s10.substring(5,10);
		
		System.out.println("s11 = "+ s11);
		System.out.println("s12 = "+ s12);
	}
	
}
