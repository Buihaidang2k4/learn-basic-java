package code;

public class Infor {
	private int a; // Chỉ có file này mới truy cập được phần tử này
	int b; // Chỉ chung một package mới lấy được truy xuất trực tiếp
	protected int c; // trong class,gói đều sử dụng được , kế thừa con cũng sử dụng được
	public int d;
	
	
	public void method()
	{
		 this.a = 1;
		 this.b = 2;
		 this.c = 3;
	}
}
