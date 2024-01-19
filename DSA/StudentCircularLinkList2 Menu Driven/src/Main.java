import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CircularLL L1 = new CircularLL();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		do {
			System.out.println("Choose The Option");
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Insert By Position");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("6.Delete By Position");
			System.out.println("7.Display Linked List");
			System.out.println("8.Exit");
			a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.println("Enter the name");
				String n = sc.next();
				System.out.println("Enter the age");
				int ag = sc.nextInt();
				System.out.println("Enter the GenderS");
				char g = sc.next().charAt(0);
				L1.InsertFirst(new Student(n, ag, g));
				break;

			}
			case 2: {
				System.out.println("Enter the name");
				String n = sc.next();
				System.out.println("Enter the age");
				int ag = sc.nextInt();
				System.out.println("Enter the Gender");
				char g = sc.next().charAt(0);
				L1.Append(new Student(n, ag, g));
				break;

			}
			case 3: {
				System.out.println("Enter the name");
				String n = sc.next();
				System.out.println("Enter the age");
				int ag = sc.nextInt();
				System.out.println("Enter the Gender");
				char g = sc.next().charAt(0);
				System.out.println("Enter The Position");
				int pos = sc.nextInt();
				L1.InsertByPos(new Student(n, ag, g), pos);
				break;

			}
			case 4: {
				L1.DeleteFirst();
				break;
			}
			case 5: {
				L1.DeleteLast();
				break;
			}
			case 6: {
				System.out.println("Enter The Position");
				int pos = sc.nextInt();
				L1.DeleteByPos(pos);
				break;
			}
			case 7: {
				System.out.println(L1);
				break;
			}
			case 8: {

				return;
			}
			}// End Of Switch

		} while (a != 8);// End Of Do

	}
}