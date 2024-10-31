import java.lang.reflect.Array;
import java.util.Arrays;

/*
 Các cách tạo mảng
 type[] array_name;
 int[] anArray = new int[10];
 int[] anArray;
 float[] anArrayofFloat;
 boolean[] anArray;
 Object[] anArrayofObject;
 String[] anArrayofString
 
 int[][] array = new int[3][];
 myArr[0] = new int[0];
 myArr[0][0] = 6;
 myArr[0][1] = 7;
 
 myArr[1] = new int[3];
 myArr[1][0] = 9;
 myArr[1][1] = 8;
 myArr[1][2] = 7;

- Cách sao chép dữ liệu
	+ Gán
	+ clone()
	+ System.arraycopy()
 
  Xác định chiều dài
  arr.length()
  
  
 */

public class Mang {
	public static void main(String[] args) {
		// Kiểu nguyên thuỷ
		int[] mang1 = {1,2,3};
		
		// copy mảng cách 1
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		
		System.out.println("Mang1_a: "+Arrays.toString(mang1));
		System.out.println("Mang1_a: "+Arrays.toString(mang1_a));

		
		// copy cách 1 	- dùng hàm clone()
		int[] mang1_b = mang1.clone();
		mang1_a[0] = 50;
		System.out.println("Mang1_b: "+Arrays.toString(mang1_a));

		// copy cách 3 	- dùng hàm System.arraycopy
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		
		mang1_c[0] = 90;
		System.out.println("Mang1_c: "+Arrays.toString(mang1_c));

		
		
	}
}
