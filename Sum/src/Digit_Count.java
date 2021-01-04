import java.util.Scanner;
public class Digit_Count {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=input.nextInt();
		System.out.println("Total digits="+count(n));
	}
	public static int count(int n)
	{
		int digit=0;
		while(n!=0)
		{
			 n/=10;
			digit++;
		}
		return digit;
		
	}

}
