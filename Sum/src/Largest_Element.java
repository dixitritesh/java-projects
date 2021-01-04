import java.util.Scanner;
public class Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr= new int[5];
		System.out.println("Enter Elements:");
		for(int i=0;i<5;i++)
		{
			arr[i]=in.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<5;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest Element is:"+max);

	}

}