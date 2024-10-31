
public class TestBox2 {
	public static void main(String[] args) {
		
		box2 box2 = new box2<Integer>(15);
		System.out.println("Giá trị: "+box2.getValueT());
		
		
		box2 box = new box2<String>("hello");
		System.out.println("Giá trị: "+box.getValueT());
		
		
		
	}
}
