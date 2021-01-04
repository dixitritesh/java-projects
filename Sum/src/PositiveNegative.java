import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=in.nextInt();
		if(num>0)
			System.out.println("Number is positive");
		else if(num<0)
		     System.out.println("Number is negative");
		else
			System.out.println("Number is zero");
		}

}
