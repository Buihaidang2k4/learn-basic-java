package De_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PhanSo pSo = new PhanSo();
		PhanSo pSo1 = new PhanSo();

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin các phân số: ");
		pSo.enterInfor(sc);
		System.out.println("-----------");
		pSo1.enterInfor(sc);

		PhanSo ketQuaPhanSo = pSo.congPhanSo(pSo1);
		System.out.println(ketQuaPhanSo);
		ketQuaPhanSo.toiGianPhanSo(ketQuaPhanSo);
		ketQuaPhanSo.timDangToiGianPhanSo(ketQuaPhanSo);
		System.out.println(ketQuaPhanSo);
		sc.close();
	}
	

}
