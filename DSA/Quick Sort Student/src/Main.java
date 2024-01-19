import java.util.Scanner;

public class Main {
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		Student []arr=new Student[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter The Name");
			String n=sc.next();
			System.out.println("Enter The Age");
			int a=sc.nextInt();
			System.out.println("Enter The Gender");
			char g=sc.next().charAt(0);
			System.out.println("Enter The Marks");
			int m=sc.nextInt();
			arr[i]=new Student(n,a,g,m);
		}
		QuickSort.display(arr);
        QuickSort.QuicksortByAge(arr);
        QuickSort.display(arr);
	}

}
