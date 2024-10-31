/*
 * Lớp con và lớp cha có mối quan hệ kế thừa
 * Phương thức trong lớp con phải có tên giống lớp cha
 * Phương pháp trong lớp con phải có tham số  giống với lớp
 * cha
 */
public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat()
	{
		System.out.println("Eat.......");
	}
	
	public void makeSound()
	{
		System.out.println("Aaaaaaaa.....");
	}
	
	public void sleep()
	{
		System.out.println("zzzzzzzzzzzzzzz.....");
	}
	
	
}
