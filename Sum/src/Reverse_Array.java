import java.util.Scanner;
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr= new int[5];
		int brr[]= new int[5];
		System.out.println("Enter Elements:");
		for(int i=0;i<5;i++)
		{
			arr[i]=in.nextInt();
		}
		int j=0;
		for(int i=4;i>=0;--i)
		{
			brr[j]=arr[i];
			j++;
		}
		System.out.println("Reversed Array is:");
		for(int i=0;i<5;i++)
		{
			System.out.print(brr[i]+" ");
		}

	}

}
