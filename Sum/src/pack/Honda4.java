package pack;
abstract class Bike{
	abstract void run();
}

public class Honda4 extends Bike {
	 void run() {
		 System.out.println("running Safely");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Honda4();
		obj.run();

	}

}
