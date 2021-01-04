package pack;
class Animals{
	void eat() {
		System.out.println("eating....");
	}
}
class Dogs extends Animals{
	void eat() {
		System.out.println("eating bread...");
	}
		void bark() {
			System.out.println("barking....");
		}
		void work() {
			super.eat();
			bark();
		}

}
public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d= new Dogs();
		d.work();

	}

}
