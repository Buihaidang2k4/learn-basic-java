package De_1;

import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSO;
	
	public PhanSo() {};
	
	public PhanSo(int tuSo, int mauSO) {
		this.tuSo = tuSo;
		this.mauSO = mauSO;
	}
	
	
	public int getTuSo() {
		return tuSo;
	}


	public int getMauSO() {
		return mauSO;
	}
	// To String
	@Override
	public String toString() {
		if (mauSO == 0 || mauSO == 1) {
			return "" + tuSo;
		}
		return  tuSo + "/" + mauSO;
	}


	// Cộng phân số
	public PhanSo congPhanSo(PhanSo phanSo){
		PhanSo ketQua = new PhanSo();
		if (this.mauSO == phanSo.mauSO) {
			ketQua.tuSo = this.tuSo + phanSo.tuSo;
			ketQua.mauSO = phanSo.mauSO;
		}else {
			ketQua.tuSo  = this.tuSo*phanSo.mauSO + this.mauSO*phanSo.tuSo;
			ketQua.mauSO = this.mauSO*phanSo.mauSO;
			
		}
		return ketQua; 
	}

	// Trừ phân số 
	public PhanSo truPhanSo(PhanSo phanSo){
		PhanSo ketQua = new PhanSo();
		if(this.mauSO == phanSo.mauSO) {
			ketQua.tuSo = this.tuSo - phanSo.tuSo;
			ketQua.mauSO = this.mauSO;
		}else {
			ketQua.tuSo = this.tuSo*phanSo.mauSO - this.mauSO*phanSo.tuSo;
			ketQua.mauSO = this.mauSO*phanSo.mauSO;
		}
		
		return ketQua;
	}

	// Nhân 
	public PhanSo nhanPhanSo(PhanSo phanSo){
		PhanSo ketQua = new PhanSo();
		ketQua.tuSo = this.tuSo * phanSo.tuSo;
		ketQua.mauSO = this.mauSO * phanSo.mauSO;
		
		return ketQua;
	}
	
	// Chia
	public PhanSo chiaPhanSo(PhanSo phanSo){
		PhanSo ketQua = new PhanSo();
		ketQua.tuSo = this.tuSo * phanSo.mauSO;
		ketQua.mauSO = this.mauSO * phanSo.tuSo;
		return ketQua;
	}
	
	// Kiểm tra phân số có tối giản hay không 
	public boolean toiGianPhanSo(PhanSo phanSo) {
		if (phanSo.tuSo % phanSo.mauSO == 0) {
			System.out.println("Phân số tối giản.");
			return true;
		}
		System.out.println("Phân số chưa tối giản !");
		return false;
	}
	
	// Tìm ước chung 
	public int timUocChung(PhanSo phanSo) {
		while(phanSo.mauSO != 0) {
			int tmp = phanSo.mauSO;
			phanSo.mauSO = phanSo.tuSo % phanSo.mauSO;
			phanSo.tuSo = tmp;
		}
		return phanSo.tuSo;
	}
	
	// Phép tìm dạng tối giản của phân số 
	public PhanSo timDangToiGianPhanSo(PhanSo phanSo) {

		System.out.println("\nDạng tối giản của phân số là : ");
		
		this.tuSo = phanSo.tuSo / timUocChung(phanSo);
		this.mauSO = phanSo.mauSO / timUocChung(phanSo);
		
		return phanSo;
	}
	
	
	// Nhập vào phân số 
	public void enterInfor(Scanner sc)
	{
		sc = new Scanner(System.in);
		
		System.out.print("Nhập tử số: ");
		this.tuSo = sc.nextInt();
		
		System.out.print("Nhập mẫu số: ");
		this.mauSO = sc.nextInt();
	}
	
	
		
	
	
}
