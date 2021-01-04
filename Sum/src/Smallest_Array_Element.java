import java.util.Scanner;
public class Smallest_Array_Element {

	public static void main(String[] args) {
		int[] arr= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<10;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("The Smallest element is:"+min );
        sc.close();
	}

}
