package So_sanh_diemTBC;

public class SinhVien  implements Comparable<SinhVien>{
	private String hoTen;
	private String maSV;
	private double diemTBC;
	
	public SinhVien(String hoTen, String maSV, double diemTBC) {
		this.hoTen = hoTen;
		this.maSV = maSV;
		this.diemTBC = diemTBC;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public double getDiemTBC() {
		return diemTBC;
	}

	public void setDiemTBC(double diemTBC) {
		this.diemTBC = diemTBC;
	}

	@Override
	public int compareTo(SinhVien o) {
		// So sánh điểm trung bình cộng 
		double diemThis = this.getDiemTBC();
		double diemO = o.getDiemTBC();
		
	    
	    if (diemThis < diemO) {
	        return -1;
	    } else if (diemThis > diemO) {
	        return 1;
	    } else {
	        return 0;
	    }
		
	}
	
	
	
}
