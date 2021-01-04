import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.println("Enter number:");
		int n=in.nextInt();
		System.out.println(check(n));
	}
	static String check(int n)
	{
		int sum=0;
		int k=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n/=10;
		}
		if(sum==k)
			return "Pallindrome";
		else
			return "Not a Pallindrome";
	}

}
