import java.util.Scanner;
public class Number_Triangle {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=in.nextInt();
		Triangle(row);
	}
	public static void Triangle(int row)
	{
		int count=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println("");
		}
	}

}
