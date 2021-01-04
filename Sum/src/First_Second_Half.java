import java.util.Scanner;
public class First_Second_Half {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= new int[50];
		int n;
		System.out.println("Enter the length of arry:");
		n=sc.nextInt();
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int temp;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
				}
			}
		}
	    for(int i=0;i<n/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
	    for(int i=n-1;i>=n/2;i--)
	    {
	    	System.out.print(arr[i]+ " ");
	    }
			

	}

}
