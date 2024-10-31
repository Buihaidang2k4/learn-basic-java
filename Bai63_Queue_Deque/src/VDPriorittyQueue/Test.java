package VDPriorittyQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		// PriorityQueue có sắp xếp các phần tử khi thêm vào 
		Queue<String> danhSach = new PriorityQueue<String>();

		danhSach.offer("Anh Đăng 3");
		danhSach.offer("Anh Đăng");
		danhSach.offer("Anh Đăng 2");
		danhSach.offer("Anh Đăng 1");

		while (true) {
			String ten = danhSach.poll(); // Lấy và xoá
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}
}
