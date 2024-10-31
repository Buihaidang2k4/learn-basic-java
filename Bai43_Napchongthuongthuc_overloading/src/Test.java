/*
 * Đặt tên giống nhau nhưng giá trị truyền vào khác nhau 
 * và có kết quả gần giống	
 */
public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("Min int:"+mm.timMin(5.0, 6.0));
		System.out.println("Min dou: "+mm.timMin(5.5, 6.0));
		System.err.println("Tinh tong:"+mm.tinhTong(4,5));
		double arr[] = new double[] {1,2,3,4,5};
		System.out.println("Tinh tong mang:"+mm.tinhTong(arr));
	}
}
