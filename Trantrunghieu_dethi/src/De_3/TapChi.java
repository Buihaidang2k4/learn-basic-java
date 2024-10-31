package De_3;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	private String soPhatHanh;
	private String thangPhatHanh;
	
	public TapChi () {};
	
	public TapChi(String maTaiLieu, String tenNXB, String soBanPhatHanh, String soPhatHanh, String thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public String getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(String soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return super.toString() + " SoPhatHanh: " + soPhatHanh + " ThangPhatHanh: "+thangPhatHanh;
	}
	
	@Override
	public void enterInfor(Scanner sc) {
		super.enterInfor(sc);
		System.out.println("Số phát hành: "); soPhatHanh = sc.nextLine();
		System.out.println("Tháng phát hành: "); thangPhatHanh = sc.nextLine();

	}
	
}
