package Programs;

import java.util.Scanner;

public class CountAndSay 
{
	public void countAndsay()
	{
		Scanner sc=new Scanner(System.in);
		String result="11";
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.close();
		if(n==1) System.out.println("1"); ;
		if(n==2) System.out.println(result);
		for(int i=3;i<=n;i++)
		{
			String str="";
			result=result+"&";
			int count=1;
			for(int j=1;j<result.length();j++)
			{
				if(result.charAt(j)!=result.charAt(j-1))
				{
					str=str+count;
					str=str+result.charAt(j-1);
					count=1;
				}
				else count++;
			}
			result=str;
		}
		
		System.out.println(result);
	}
	public static void main(String[] args) {
		new CountAndSay().countAndsay();
	}
}
