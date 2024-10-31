package BaiThucHanh2;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;
	
	public TamGiac() {}

	public TamGiac(Diem a, Diem b, Diem c) {
		A = a;
		B = b;
		C = c;
	}
	public float chuVi() {
		float AB = A.kc(B);
		float BC = B.kc(C);
		float CA = C.kc(A);
		float p = AB + BC + CA;
		return p;
	}
	
	public float dienTich() {
		float AB = A.kc(B);
		float BC = B.kc(C);
		float CA = C.kc(A);
		float p =chuVi()/2;// Nửa chu vi
		float dt = (float) Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
		
		return dt;
	}
	
	
}
