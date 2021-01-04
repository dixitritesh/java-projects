import java.util.Scanner;
public class Recursion_Fibonacci{
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number:");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++)
		  System.out.print(fib(i)+" ");
		
	}
	public static int fib(int n)
	{
		if((n==0)||(n==1))
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
}