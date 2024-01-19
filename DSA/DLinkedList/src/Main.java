import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DLinkedList d1=new DLinkedList();
		int ch=0;
		do {
			System.out.println("Enter The Option");
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Insert By Position");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("6.Delete By Position");
			System.out.println("7.Print Reverse");
			System.out.println("8.Print");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1:
			{
				System.out.println("Enter The Element To Insert");
				int var=sc.nextInt();
				d1.insert(var);
				break;
			}
			case 2:
			{
				System.out.println("Enter The Element To Append");
				int var=sc.nextInt();
				d1.append(var);
				break;
			}
			case 3:
			{
				System.out.println("Enter The Element And Position To Insert");
				int var=sc.nextInt();
				int pos=sc.nextInt();
				d1.Insertpos(var, pos);			
				break;
			}
			case 4:
			{
				d1.DeleteFirst();
				break;
			}
			case 5:
			{
				d1.DeleteLast();
				break;
			}
			case 6:
			{
				System.out.println("Enter The Element Position To Delete");
				int pos=sc.nextInt();
				d1.deletepos(pos);
				break;
			}
			case 7:
			{
				d1.RevPrint();
				break;
			}
			case 8:
			{
			    System.out.println(d1);
				break;
			}
			default:
			{
			return;
			}
			
			}//End OF Switch
		}while(ch != 9);//End Of Do
		if(ch>=9)
		{
			return;
		}
		
	

	}

}
