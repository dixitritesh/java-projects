import java.util.Scanner;
public class Number_Pyramid {

	public static void main(String[] args) {
		int count=0;
		int k=1;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n= in.nextInt();
		for(int i=n;i>=1;i--)
		{
			count++;
			for(int j=1;j<=n*2;j++)
			{
				if((j>=i&&j<=(n-1)+count)&& k==1)
				{
					System.out.print(count);
					k=0;
				}
				else
				{
					System.out.print(" ");
					k=1;
				}
				
			}
			System.out.println(" ");
		}

	}

}
