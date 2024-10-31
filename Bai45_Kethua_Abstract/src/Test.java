
public class Test {
	public static void main(String[] args) {
		HangSanXuat hangSanXuat1 = new HangSanXuat("Mec","VietNam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("toyo","VietNam");
		HangSanXuat hangSanXuat3 = new HangSanXuat("pana","VietNam");

		PhuongTienDiChuyen p1 = new MayBay(hangSanXuat1, "Xăng");
		PhuongTienDiChuyen p2 = new XeDap(hangSanXuat2);
		PhuongTienDiChuyen p3 = new XeOto(hangSanXuat3, "Xăng dầu");

		System.out.print("Tên loại phương tiện:\n");		
		System.out.print(p1.getLoaiPhuongTien()+ p1.layTenHangSanXuat());

		System.out.println("Bắt đầu:\n");
		p2.batDau();
		p2.dungLai();
			
		System.out.println("Lấy Vận Tốc:\n");
		System.out.println("p1:"+p1.layVanToc());
		System.out.println("p2:"+p2.layVanToc());
		System.out.println("p3:"+p3.layVanToc());
	
	}
}
