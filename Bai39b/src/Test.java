
public class Test {
	public static void main(String[] args) {
		
	ConNguoi people1 = new ConNguoi("Anh Đăng", 10);

	people1.an();
	people1.ngu();
	people1.uong();
	
	HocSinh student = new HocSinh("Anh dz", 2002, "Lop 10", "THCS");
	// Kế thừa ăn uống ngủ từ con người 
	student.an();
	student.uong();
	student.ngu();
	student.lamBaiTap();
	
	}
}
