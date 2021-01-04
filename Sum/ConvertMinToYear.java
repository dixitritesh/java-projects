import java.util.Scanner;
public class ConvertMinToYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double minutesInYear= 60*24*365;
		System.out.println("Enter Minutes:");
		long Year=(long)(min/minutesInYear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+" = "+years+" years and "+days" days");
	}

}
