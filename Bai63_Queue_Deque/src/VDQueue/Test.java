package VDQueue;

import java.util.LinkedList;
import java.util.Queue;

// Vào trước ra trước
// Deque là hàng đợi hai đầu 
// Queue
// Các thuộc tính Insert add(e) 
//,Remove,Examine,
//poll() Lấy ra trả về true/false || remove() Trả về ngoại lệ 
//,peek() trả về T/F || element() Trả về ngoại lệ
//offer(e) trả về true/false

public class Test {
	public static void main(String[] args) {
		Queue<String> danhSach = new LinkedList<String>();
		
		danhSach.offer("Anh Đăng");
		danhSach.offer("Anh Đăng 1");
		danhSach.offer("Anh Đăng 2");
		danhSach.offer("Anh Đăng 3");
		
		while (true) {
			String ten = danhSach.poll(); // Lấy và xoá
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
		
		
	}
}
