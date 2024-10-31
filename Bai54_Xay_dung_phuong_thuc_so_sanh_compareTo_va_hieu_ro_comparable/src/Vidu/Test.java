package Vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 =  new SinhVien(100," anh", "lop 1", 9);
		SinhVien sv2 =  new SinhVien(111," bnh", "lop 2", 19);
		SinhVien sv3 =  new SinhVien(150,"canh", "lop 3", 99);

		
		System.out.println("So sánh sv1 && sv 2: "+sv1.compareTo(sv2));
		System.out.println("So sánh sv1 && sv 3:"+sv1.compareTo(sv3));
		
	}

	
}
