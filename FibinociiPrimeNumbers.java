package Programs;

import java.util.Scanner;

public class FibinociiPrimeNumbers 
{
	static Scanner sc=new Scanner(System.in);
	public static void logic()
	{
		System.out.println("Enter the numbers you want");
		int n=sc.nextInt();
		int num1=1;
		int num2=1;
		int num3;
		int count=0;
		for(;;)
		{
			num3=num1+num2;
			boolean isTrue=true;
			for(int j=2;j<=num3/2;j++)
			{
				if(num3%j==0)
				{
					isTrue=false;
				}
			}
			if(isTrue)
			{
				count++;
				System.out.println(num3);
			}
			if(count==n)
			{
				break;
			}
			else
			{
				num1=num2;
				num2=num3;
			}
		}
	}
	public static void main(String[] args) {
		FibinociiPrimeNumbers.logic();	
	}
}
