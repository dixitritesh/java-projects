package pack;

public class TestSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.printColor();

	}

}
class Animal{
	String color="White";
}
class Dog extends Animal{
	String color="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
