package De_4;

import java.util.Scanner;

public class Khoi_C extends ThiSinh{
	private String van;
	private String su;
	private String dia;
	
	public Khoi_C() {}

	public Khoi_C(String van, String su, String dia) {
		super();
		this.van = van;
		this.su = su;
		this.dia = dia;
	}

	public String getVan() {
		return van;
	}

	public void setVan(String van) {
		this.van = van;
	}

	public String getSu() {
		return su;
	}

	public void setSu(String su) {
		this.su = su;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	};
	
	@Override
	public String toString() {
		return super.toString()+" ,Văn: "+van+" ,Sử: "+su+" ,Địa: "+dia;
	}

	@Override
	public void enterInfor(Scanner scanner) {
		super.enterInfor(scanner);
		System.out.println("Nhập điểm văn:"); van = scanner.nextLine();
		System.out.println("Nhập điểm sử:"); su = scanner.nextLine();
		System.out.println("Nhập điểm địa:"); dia = scanner.nextLine();
	}
	
}
