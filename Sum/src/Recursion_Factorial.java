import java.util.Scanner;
public class Recursion_Factorial {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number:");
		int n= in.nextInt();
		System.out.println("Factorial is "+fact(n));

	}
	protected static int fact(int n)
	{
		if(n==0|| n==1)
			return 1;
		else
			return n*fact(n-1);
	}

}
