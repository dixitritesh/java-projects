import java.util.Scanner;
public class Hcf_Gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int n1=sc.nextInt();
		System.out.print("Enter second number:");
		int n2=sc.nextInt();
		
		int n=1;
		System.out.print("Hcf of "+n1+" and "+n2+ "=");
		if(n1!=n2)
		{
			while(n!=0)
			{
				n=n1%n2;
				if(n!=0)
				{
					n1=n2;
					n2=n;
				}
			}
			System.out.println(n2);
		}
		else
			System.out.println("Wrong input");
		
		sc.close();

	}

}
