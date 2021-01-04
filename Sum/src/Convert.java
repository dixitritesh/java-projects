import java.util.Scanner;
public class Convert{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double minutesInYear= 60*24*365;
		System.out.println("Enter Minutes:");
		double min=sc.nextDouble();
		long Year=(long)(min/minutesInYear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+" = "+Year+" years and "+days+" days");
	}

}
