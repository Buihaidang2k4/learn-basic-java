package So_sanh_diemTBC;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Hai", "444", 5.5);
		SinhVien sv2 = new SinhVien("Hai", "444", 7.5);
	
		System.out.println("Điểm sv1 vs sv2: "+sv1.compareTo(sv2));
	}
}

