package De_7;

import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

import org.ietf.jgss.Oid;

public class Nguoi {
	private String hoVaTen;
	private int ngay,thang,nam;
	private String queQuan;
	
	
	public Nguoi() {};

	public Nguoi(String hoVaTen, int ngay, int thang, int nam, String queQuan) {
		this.hoVaTen = hoVaTen;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.queQuan = queQuan;
	}


	public String getHoVaTen() {
		return hoVaTen;
	}

	public int getNgay() {
		return ngay;
	}


	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	public String getQueQuan() {
		return queQuan;
	}

	
	// Nhập thông tin về mỗi cá nhân
	public void nhapThongTinNguoi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: "); hoVaTen = sc.nextLine();
		System.out.println("Nhập ngày sinh:(dd/MM/yyyy) "); 
		System.out.println("Nhập ngày: "); ngay = sc.nextInt();
		System.out.println("Nhập tháng: "); thang = sc.nextInt();
		System.out.println("Nhập năm: "); nam = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập quê quán:  "); queQuan = sc.nextLine();
	}


	@Override
	public String toString() {
		return "hoVaTen=" + hoVaTen + ",NgaySinh: " + ngay + "/" + thang + "/" + nam + ", queQuan=" + queQuan;
	}
	
	

}
