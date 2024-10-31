package Test;

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Day.Monday, "Toán lý hoá");
		ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Monday, "Văn lý hoá");
		ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Monday, "Địa lý hoá");
		ThoiKhoaBieu tkb4 = new ThoiKhoaBieu(Day.Monday, "ANh lý hoá");
		
		System.out.println(tkb4);
	
	
		int x = Thang.Tháng_ba.soNgay();
		System.out.println(x);
	}
	
		
	
}
