package BaiThucHanh2;

public class Main {
	public static void main(String[] args) {
		Diem A = new Diem(3, -4);
		Diem B = new Diem(1, 5);
		Diem C = new Diem(3, 1);

		
		TamGiac tam = new TamGiac(A, B, C);
		
		System.out.println("CHU VI: "+tam.chuVi());
		System.out.println("DIEN TICH: "+tam.dienTich());
		
		
	}
}
