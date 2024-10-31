package bai36;

public class test_quan_li_bo_phim {
	public static void main(String[] args) {
		Ngay ngay1 =  new Ngay(4,5,2020);
		Ngay ngay2 =  new Ngay(3,5,2020);
		Ngay ngay3 =  new Ngay(5,5,2020);
		
		HangSanXuat hang1 = new HangSanXuat("Abc", "Việt Nam ");
		HangSanXuat hang2 = new HangSanXuat("cde", "Hai phong ");
		HangSanXuat hang3 = new HangSanXuat("efg", "ha nam ");
		
		BoPhim phim1 = new BoPhim("Chào mùa xuân", 2020, hang1, 10000, ngay1);
		BoPhim phim2 = new BoPhim("Chào mùa hè", 2021, hang2, 1000, ngay2);
		BoPhim phim3 = new BoPhim("Chào mùa thu", 2022, hang3, 20000, ngay3);
		
		System.out.println("Gia ve re hon: "+phim1.giaVeReHon(phim2));
		System.out.println("Gia ve re hon: "+phim2.giaVeReHon(phim3));
		System.out.println("Gia ve re hon: "+phim1.giaVeReHon(phim3));
		
		System.out.println("Tên hãng sản xuất: "+phim1.layTenHangSanXuatPhim());
		System.out.println("Tên hãng sản xuất: "+phim2.layTenHangSanXuatPhim());
		System.out.println("Tên hãng sản xuất: "+phim3.layTenHangSanXuatPhim());
		
		System.out.println("Gia sau khi giam %: "+phim1.giaSauKhiKhuyenMai(10));
		System.out.println("Gia sau khi giam %: "+phim2.giaSauKhiKhuyenMai(20));
		System.out.println("Gia sau khi giam %: "+phim3.giaSauKhiKhuyenMai(30));
	}
}
