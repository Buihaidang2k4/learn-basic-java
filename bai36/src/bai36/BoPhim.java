package bai36;

public class BoPhim {
	private String tenBoPhim;
	private int namXuatBan;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieu;
	
	public BoPhim(String tenBoPhim, int namXuatBan, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		this.tenBoPhim = tenBoPhim;
		this.namXuatBan = namXuatBan;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public String getTenBoPhim() {
		return tenBoPhim;
	}

	public void setTenBoPhim(String tenBoPhim) {
		this.tenBoPhim = tenBoPhim;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean giaVeReHon(BoPhim boPhimKhac)
	{
		return this.giaVe < boPhimKhac.giaVe;
	}
	
	public String layTenHangSanXuatPhim()
	{
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	public double giaSauKhiKhuyenMai(double x)
	{
		return this.giaVe*(1-x/100); 
	}
	
	
	
}
