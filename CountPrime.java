package Programs;

import java.util.Scanner;

public class CountPrime 
{
	static Scanner sc=new Scanner(System.in);
	public static int check=1;
	public static void logic()
	{
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean isTrue=true;
			for(int j=2;j<i;j++ )
			{
				if(i%j==0)
				{
					isTrue=false;
					break;
				}
			}
			if(isTrue && i!=1)
			{
				CountPrime.num(i);
			}
		}
	}
	private static void num(int i) {
		int temp=i;
		int count=0;
		while(i!=0)
		{
			count++;
			i=i/10;
		}
		if(check!=count)
		{
			check++;
			System.out.println();
			
		}
		System.out.print(temp+" ");
	}
	public static void main(String[] args) {
		CountPrime.logic();
	}
}
