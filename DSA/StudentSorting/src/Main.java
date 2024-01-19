import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student []arr=new Student[3];
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter the name");
		String n=sc.next();
		System.out.println("Enter the age");
		int a=sc.nextInt();
		System.out.println("Enter the Gender");
		char g=sc.next().charAt(0);
		arr[i]=new Student(n,a,g);
	}
	
     //System.out.println(arr);
	Sort.byAgeAscending(arr);
     Sort.display(arr);

     Sort.byAgeDescending(arr);
      Sort.display(arr);
      Sort.SortNameAscending(arr);
      Sort.display(arr);

	}

}
