package pack;
interface R{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements R{
	public void c() {
		System.out.println("I am c");
	}
}
class M extends B{
	public void a() {
		System.out.println("I am a");
	}
	public void b()
	{
		System.out.println("I am B");
	}
	public void d() {
		System.out.println("I am d");
	}
}



class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R j= new M();
		j.a();
		j.b();
		j.c();
		j.d();
	}

}
