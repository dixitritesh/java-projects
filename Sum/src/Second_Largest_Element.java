import java.util.Scanner;
public class Second_Largest_Element {
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
	   System.out.println("Second largest Elements="+large(a,5));
	}
	   public static int large(int[] a, int total)
	   {
		   int temp;
		   for(int i=0;i<total;i++)
		   {
			   for(int j=i+1;j<total;j++)
			   {
				   if(a[i]>a[j])
				   {
					   temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
							   
				   }
			   }
		   }
		   return a[1];
	   }
		
		
}
