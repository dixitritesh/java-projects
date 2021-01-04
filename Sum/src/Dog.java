
public class Dog {
	String breed;
	String size;
	int age;
	String color;
	
	public String getInfo()
	{
		return("Breed is:" +breed+ " size is:" +size+ " age is:" +age+ " color is:"+color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog street= new Dog();
		street.breed="Street";
		street.size=" Small";
		street.age= 2;
		street.color="black";
		 
		System.out.println(street.getInfo());

	}

}
