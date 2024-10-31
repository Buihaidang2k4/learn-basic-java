package test;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push("abc"); => đưa giá trị vaof
//		stackChuoi.pop() => Lấy giá  trị ra và xoá nó khởi stack
//		stackChuoi.peek() => lấy giá trị ra nhưng không xoá nó khỏi ngăn xếp 
//		stackChuoi.clear(); => xoá hết phần tử
//		stackChuoi.contains("gia tri") => xác định xem có tồn tại không trong stack
		
		
//		// Đảo ngược chuỗi
//		System.out.println("Nhập vào chuỗi: ");
//		String s = sc.nextLine();
//		// TITV
//		for (int i = 0; i < s.length(); i++) {
//			stackChuoi.push(s.charAt(i)+ "");
//		}
//		
//		System.out.println("Chuỗi đảo ngược");
//		for (int i = 0; i < s.length(); i++) {
//				System.out.print(stackChuoi.pop());
//		}
//		
		// Chuyển thập phân sang nhị phân
		Stack<Integer> nhiPhan = new Stack<Integer>();
		System.out.println("Nhập 1 só nguyên dương: ");
		int x = sc.nextInt();
		while (x>0) {
			int soDu = x%2;
			nhiPhan.push(soDu);
			x = x/2;
		}
		int size = nhiPhan.size();
		System.out.println("Nhị phân: ");
		while(size>0)
		{
			System.out.print(nhiPhan.pop());
			size--;
		}
		
		
		
	}
}
