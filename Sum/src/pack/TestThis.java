package pack;
class Amn{
	void m() {
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println(" hello n");
		this.m();
	}
}

public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amn a=new Amn();
		a.n();

	}

}
