
public class ConNguoi {
	protected String hoVaTenString;
	protected int namSinh;
	
	public ConNguoi(String hoVaTenString, int namSinh) {
		this.hoVaTenString = hoVaTenString;
		this.namSinh = namSinh;
	}

	public String getHoVaTenString() {
		return hoVaTenString;
	}

	public void setHoVaTenString(String hoVaTenString) {
		this.hoVaTenString = hoVaTenString;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void  an() {
		System.out.println("I'm eating.....");
	}
	
	public void ngu()
	{
		System.out.println("sleeping.....");
	}	
}
