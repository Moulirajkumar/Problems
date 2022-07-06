import java.util.Scanner;

public class StudentMain 
{
	static Scanner sc=new Scanner(System.in);
	public static void insertionSort(StudentPojo arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			StudentPojo temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j].getId()>temp.getId())
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(Object obj:arr)
		{
			System.out.println(obj.toString());
		}
	}
	public static void data()
	{
		System.out.println("Enter the Number of Elements/Objects you need ? ");
		int n=sc.nextInt();
		int id;
		String name;
		StudentPojo[] array=new StudentPojo[n];
		System.out.println("Enter the id and name into the objects:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Student id");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Student name");
			name=sc.nextLine();
			array[i]=new StudentPojo(id,name);
		}
		StudentMain.insertionSort(array);
	}
	public static void main(String[] args) {
		StudentMain.data();
	}
}
