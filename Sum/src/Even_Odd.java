import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=input.nextInt();
		System.out.println("Number is:"+check(n));

	}
	static String check(int n)
	{
		if(n%2==0)
			return "Even";
		else
			return "Odd";
	}

}
