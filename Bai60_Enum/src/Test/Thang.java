package Test;

public enum Thang {
	Tháng_môt(31),
	Tháng_hai(29),
	Tháng_ba(31),
	Tháng_tư(30),
	Tháng_nam(31),
	Tháng_sau(30),
	Tháng_bay(31),
	Tháng_tam(31),
	Tháng_chin(30),
	Tháng_muoi(31),
	Tháng_muoi_mot(30),
	Tháng_muoi_hai(31),
	
	private final int soNgay;
	Thang (int soNgay)
	{
		this.soNgay = soNgay;
	}
	
	public int soNgay() {
		return this.soNgay;
	}
}
