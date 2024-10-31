
public class MayBay extends PhuongTienDiChuyen{
	private String LoaiNhienLieu;

	public MayBay(HangSanXuat hangSanXuat,String loaiNhienLieu) {
		super("Máy Bay", hangSanXuat);
		LoaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	@Override
	public double layVanToc()
	{
		return 500;
	}
	
	public void catCanh()
	{
		System.out.println("Take off...");
	}
	
	public void haCanh()
	{
		System.out.println("landing...");
	}
}
