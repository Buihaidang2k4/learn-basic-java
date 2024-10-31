
public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;
	
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public String layTenHangSanXuat()
	{
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	public void batDau()
	{
		System.out.println("Bắt đầu...");
	}
		
	public void tangToc()
	{
		System.out.println("Speed up...");
	}
	
	public void dungLai()
	{
		System.out.println("Stop now...");
	}
	
	public abstract double layVanToc();
	
	 
	
}
