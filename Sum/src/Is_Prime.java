import java.util.Scanner;
public class Is_Prime {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter lowest term:");
		int l=in.nextInt();
		System.out.println("Enter greatest term:");
		int g=in.nextInt();
		System.out.println("Prime numbers are:");
		if(l<g)
		{
			for(int i=l;i<=g;i++)
			{
				int count=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
						count++;
				}
				if(count==0)
					System.out.print(i+" ");
			}
		}
		else
			System.out.println("Invalid input:");

	}

}
