import java.util.Scanner;
public class Array_Input_Form_User {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array:");
		for(int i=0;i<10;i++)
		{
			arr[i]=in.nextInt();
		}
		
		System.out.println("You have entered:");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
