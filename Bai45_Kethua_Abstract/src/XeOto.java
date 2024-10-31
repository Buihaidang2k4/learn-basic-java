
public class XeOto extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public XeOto(HangSanXuat hangSanXuat,String loaiNhienLieu) {
		super("Xe oto",hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 50;
	}
	
	
}
