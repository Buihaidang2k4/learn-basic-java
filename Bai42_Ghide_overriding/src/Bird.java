
public class Bird extends Animal {

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("Tôi gạo....");
	}

	@Override
	public void makeSound() {
		System.out.println("Éc Éc");
	}

}
