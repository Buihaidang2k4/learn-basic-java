package De_4;

import java.util.Scanner;

public class Khoi_B extends ThiSinh{
	private String toan;
	private String hoa;
	private String sinh;
	
	public Khoi_B () {};
	
	public Khoi_B(String toan, String hoa, String sinh) {
		super();
		this.toan = toan;
		this.hoa = hoa;
		this.sinh = sinh;
	}

	public String getToan() {
		return toan;
	}

	public void setToan(String toan) {
		this.toan = toan;
	}

	public String getHoa() {
		return hoa;
	}

	public void setHoa(String hoa) {
		this.hoa = hoa;
	}

	public String getSinh() {
		return sinh;
	}

	public void setSinh(String sinh) {
		this.sinh = sinh;
	}
	
	@Override
	public String toString() {
		return super.toString()+" ,Toán: "+toan+" ,Hoá: "+hoa+" ,Sinh: "+sinh;
		
	}
	@Override
	public void enterInfor(Scanner scanner) {
		super.enterInfor(scanner);
		System.out.println("Nhập điểm toán:"); toan = scanner.nextLine();
		System.out.println("Nhập điểm hoa:"); hoa = scanner.nextLine();
		System.out.println("Nhập điểm sinh:"); sinh = scanner.nextLine();
	}
	
}
