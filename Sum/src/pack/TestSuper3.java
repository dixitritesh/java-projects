package pack;

class Animal3{
	Animal3(){
		System.out.println("Animal is created");
	}
}
class Dog6 extends Animal3{
	Dog6(){
		super();
		System.out.println("dog is created");
	}
}
public class TestSuper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog6 d=new Dog6();

	}

}
