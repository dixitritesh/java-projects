package pack;
class Bike1{
	final void run() {
		System.out.println("running bike");
	}
}

class Honda extends Bike1 {
	//void run()
	//{
	//	System.out.println("Running Honda");
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda honda= new Honda();
		honda.run();

	}

}
