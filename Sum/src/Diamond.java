import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<=13;i++)
		{
			if(i<=6)
			{
				for(int j=1;j<=13;j++)
				{
					if(j>=7-i && j<=7+i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			else
			{
				
				for(int j=1;j<=13;j++)
				{
					if(j>count && j<=13-count)
					{
					    System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				count++;
			}
			System.out.println("");
		}

	}

}
