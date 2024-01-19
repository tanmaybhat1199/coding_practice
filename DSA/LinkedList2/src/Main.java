import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LinkedList LL = new LinkedList();
		int ch=0;
		do {
			System.out.println("Enter The Choice");
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Insert By Position");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("6.Delete By Pos");
			System.out.println("7.Get Smallest Element");
			System.out.println("8.Get Largest Element");
			System.out.println("9.Get Odd Elements");
			System.out.println("10.Get Even Elements");
			System.out.println("11.Print Reverse Linked List");
			System.out.println("12.Reverse Linked List");
			System.out.println("13.Insert By Value");
		    ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter The Element To Insert");
				int var=sc.nextInt();
				LL.insert(var);
				break;
			}
			case 2:
			{
				System.out.println("Enter The Element To Append");
				int var=sc.nextInt();
				LL.append(var);
				break;
			}
			case 3:
			{
				System.out.println("Enter The Element And Position To Insert");
				int var=sc.nextInt();
				int pos=sc.nextInt();
				LL.insertbypos(var, pos);
				break;
			}
			case 4:
			{
				LL.deleteFirst();
				break;
			}
			case 5:
			{
				LL.deletelast();
				break;
			}
			case 6:
			{
				System.out.println("Enter The Element Position To Delete");
				int pos=sc.nextInt();
				LL.deletebypos(pos);
				break;
			}
			case 7:
			{
				LL.FindSmall();
				break;
			}
			case 8:
			{
				LL.FindLarge();
				break;
			}
			case 9:
			{
				LL.OddNum();
				break;
			}
			case 10:
			{
				LL.EvenNum();
				break;
			}
			case 11:
			{
				LL.reverseprint();
				break;
			}
			case 12:
			{
				LL.reverse();
				System.out.println(LL);
				break;
			}
			case 13:
			{
				int var=sc.nextInt();
				int value=sc.nextInt();
				LL.InsertByValue(var, value);
				break;
			}
			default:
			{
			return;
			}
			}//End of Switch
			
			
		}while(ch != 14);//End Of do
		
	
	}
	

}
