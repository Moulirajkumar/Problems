package patterns;

import java.util.Scanner;

public class PatternStar
{
	static Scanner sc=new Scanner(System.in);
	public void pattern()
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i+j>=n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternStar ps=new PatternStar();
		ps.pattern();
	}
}
