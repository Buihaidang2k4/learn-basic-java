package VDDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		// Thêm đc vào cả hai đầu danh sách
		Deque<String> danhSach = new ArrayDeque<String>();

		
		danhSach.offer("Anh Đăng");
		danhSach.offer("Anh Đăng 1");
		danhSach.offer("Anh Đăng 2");
		danhSach.offer("Anh Đăng 3");
		danhSach.addFirst("Anh A");
		danhSach.addLast("Anh C");
		while (true) {
			String ten = danhSach.poll(); // Lấy và xoá
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}
}
