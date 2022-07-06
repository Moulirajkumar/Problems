package patterns;

import java.util.Scanner;

public class patternSpace 
{
	static Scanner sc=new Scanner(System.in);
	public patternSpace()
	{
		System.out.println("Enter the odd number only");
		int n=sc.nextInt();
		int count=1;
		int space=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<count;j++)
			{
				System.out.print("* ");
			}
			if(i<n/2)
			{
				count++;
				space--;
			}
			else
			{
				count--;
				space++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new patternSpace(); 
	}
}
