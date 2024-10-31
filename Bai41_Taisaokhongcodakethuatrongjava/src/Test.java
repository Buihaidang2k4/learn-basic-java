
public class Test {
	public static void main(String[] args) {
		ConNguoi  people = new ConNguoi("Bui Thi Ha", 2003);
		people.an();
		people.ngu();
		
		NguoiVietNam vNam = new NguoiVietNam("Nguyễn Hải Châu", 2001);
		System.out.println("Người Việt Nam chào:");
		vNam.xinChao();
		
		NguoiBaLan baLan = new NguoiBaLan("Jack", 2000);
		System.out.println("Người Balan chào:");
		baLan.xinChao();
		
		NguoiMy my = new NguoiMy("Adammm", 5000);
		System.out.println("Người Mỹ Chào:");
		my.xinChao();
		
		HocSinh student = new HocSinh("Châu Nhuận Phát", 3440);
		student.an();
		
	}
}
