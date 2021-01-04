package pack;
class stud{
	int roll;
	String name;
	float fee;
	stud(int roll, String name, float fee)
	{
		this.roll=roll;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(roll+","+name+","+fee);
	}
}

public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud obj1= new stud(1,"ritesh",2500f);
		obj1.display();

	}

}
