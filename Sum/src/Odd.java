import java.util.Scanner;
public class Odd {
       public static void main(String[] args)
       {
    	   Scanner in =new Scanner(System.in);
    	   System.out.println("Enter value of n:");
    	   int n=in.nextInt();
    	   int sum=0;
    	   System.out.println("The odd numbers are:");
    	   for(int i=1;i<=n*2;i+=2)
    	   {
    		   System.out.println(i);
    		   sum+=i;
    	   }
    	   System.out.println("The sum of odd natural numbers upto "+n+" terms is "+sum);
       }
}
