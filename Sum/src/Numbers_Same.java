import java.util.Scanner;
public class Numbers_Same {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENter number 1:");
		int n1=input.nextInt();
		System.out.println("Enter number 2:");
		int n2= input.nextInt();
		System.out.println("Enter number 3:");
		int n3=input.nextInt();
		
		if(n1==n2)
		{
			if(n2==n3)
			   System.out.println("All are Same");
			else
				System.out.println("Neither all are Equal nor Different");
		}
		else if(n1==n3|| n2==n3)
			System.out.println("Neither all are equal nor different");
		else
			System.out.println("All are different");

	}

}
