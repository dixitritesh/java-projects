import java.util.Scanner;
import java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input a:");
		int a=in.nextInt();
		System.out.println("Input b:");
		int b=in.nextInt();
		System.out.println("Input c:");
		int c=in.nextInt();
		
		double d=(b*b)-4*a*c;
		double x=((-b)+Math.sqrt(d))/2*a;
		double y=((-b)-Math.sqrt(d))/2*a;
		
		System.out.println("Roots of equation are: x="+x+ " y="+y);

	}

}
