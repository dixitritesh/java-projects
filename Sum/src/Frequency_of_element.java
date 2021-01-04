import java.util.Scanner;
public class Frequency_of_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[100];
		int []freq=new int[100];
		int size,k,j,count;
		System.out.print("enter the size:");
		   size=sc.nextInt();
		
		System.out.println("Enter the elements:");
		for(k=0;k<size;k++)
		{
			arr[k]=sc.nextInt();
			freq[k]=-1;
		}
		for(k=0;k<size;k++)
		{
			count=1;
			for(j=k+1;j<size;j++)
			{
				if(arr[k]==arr[j])
				{
					count++;
					freq[j]=0;
				}
			}
			if(freq[k]!=0)
			{
				freq[k]=count;
			}
		}
		System.out.println("Frequency of all elements:");
		for(k=0;k<size;k++)
		{
			if(freq[k]!=0)
			{
				System.out.println(arr[k]+ " occurs "+freq[k]+" times");
			}
		}
		

	}

}
