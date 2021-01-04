import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number:");
		int n= in.nextInt();
		Reverse(n);

	}
	static void Reverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			n/=10;
			sum=sum*10+r;
		}
		System.out.println(sum);
	}

}
