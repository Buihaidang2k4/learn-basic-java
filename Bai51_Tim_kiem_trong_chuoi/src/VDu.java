
public class VDu {
	public static void main(String[] args) {
		String s1  = " ô Xin chào,minh hahha  la minh chao xin ray,ô Xin chào";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
		
		// Hàm tìm kiếm indexOf
		System.out.println("Vị trí của s2 trong s1 là: "+s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong s1 là: "+s1.indexOf(s3));

		// Sử dụng vị trí bắt đầu
		System.out.println("Vị trí của s3 trong s1 là: "+s1.indexOf(s2,2));

		// Tìm kiếm char
		System.out.println("-Vị trí của c1 trong s1 là(Trái sang phải): "+s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s1 là: "+s1.indexOf(c1,20));

		// Hàm LastIndexof => tìm kiếm từ phải sang trái
		System.out.println("-Vị trí của c1 trong s1 là (từ phải sang trái): "+s1.lastIndexOf(c1));
		
		
		
	
	
	
	}
}
