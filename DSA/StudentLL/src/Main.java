import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LinkedList LL = new LinkedList();
		
		Student s1=new Student("Ram",21,'M');
		Student s2=new Student("Ramesh",22,'M');
		Student s3=new Student("Suresh",24,'M');
		Student s4=new Student("Rani",19,'F');
		Student s5=new Student("Vani",23,'F');
		
		
		do
		{
			System.out.println("Enter The Choice");
			System.out.println("1.Insert First"); 
			System.out.println("2.Insert Last");
			System.out.println("3.Insert By Position");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("5.Delete By Position");
			int a=sc.nextInt();
			switch(a) {
			case 1:
			{
			
			}
			
			}//End Of Switch
			
			
		}//end of do
	}

}
