package De_4;

import java.util.Scanner;

public class Khoi_A extends ThiSinh{
	private String toan;
	private String ly;
	private String hoa;
	
	public Khoi_A() {};
	
	
	public Khoi_A(String toan, String ly, String hoa) {
		super();
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}


	public String getToan() {
		return toan;
	}


	public void setToan(String toan) {
		this.toan = toan;
	}


	public String getLy() {
		return ly;
	}


	public void setLy(String ly) {
		this.ly = ly;
	}


	public String getHoa() {
		return hoa;
	}


	public void setHoa(String hoa) {
		this.hoa = hoa;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " ,Toán: "+toan+" ,Lý: "+ly+ " ,Hoá: "+hoa;
	}
	
	@Override
	public void enterInfor(Scanner scanner) {
		super.enterInfor(scanner);
		System.out.println("Nhập điểm toán:"); toan = scanner.nextLine();
		System.out.println("Nhập điểm ly:"); ly = scanner.nextLine();
		System.out.println("Nhập điểm hoa:"); hoa = scanner.nextLine();

		
	}
	
}
