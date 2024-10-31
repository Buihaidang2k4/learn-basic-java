package De_3;

import java.util.Scanner;

public class Sach extends TaiLieu{
		private String tenTG;
		private String soTrang;
		
		public Sach() {};
		
		public Sach(String maTaiLieu, String tenNXB, String soBanPhatHanh, String tenTG, String soTrang) {
			super(maTaiLieu, tenNXB, soBanPhatHanh);
			this.tenTG = tenTG;
			this.soTrang = soTrang;
		}

		public String getTenTG() {
			return tenTG;
		}

		public void setTenTG(String tenTG) {
			this.tenTG = tenTG;
		}

		public String getSoTrang() {
			return soTrang;
		}

		public void setSoTrang(String soTrang) {
			this.soTrang = soTrang;
		}
		
		@Override
		public String toString() {
		return super.toString() + " TênTG: "+ tenTG + " SoTrang: "+soTrang;
		}
		
		@Override
		public void enterInfor(Scanner sc) {
		super.enterInfor(sc);
			System.out.println("Nhập tênTG: "); tenTG = sc.nextLine();
			System.out.println("Nhập soTrang: "); soTrang = sc.nextLine();
		}
}
