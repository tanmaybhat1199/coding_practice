import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		Stack st = new Stack();
		Stack st1 = new Stack();
		Stack St2;
		System.out.println("Enter The Elements Of Object");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter The Name");
			String a = sc.next();
			System.out.println("Enter The Age");
			int b = sc.nextInt();
			System.out.println("Enter The Gender");
			char c = sc.next().charAt(0);
			arr[i] = new Student(a, b, c);

		}
		st1.push(arr[0]);
		st1.push(arr[1]);
		int ch;
		do {
			System.out.println("Select The Choice");
			System.out.println("1.Push");
			System.out.println("2.pop");
			System.out.println("3.Equal Check");
			System.out.println("4.Concate");
			System.out.println("5.Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the Object (0/1/2)");
				int i = sc.nextInt();
				st.push(arr[i]);
				System.out.println(st);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				St2 = st.concate(st1);
				System.out.println(St2);
				break;
			case 4:
				if (st.equals(st1)) {
					System.out.println("Stacks Are Equal");
				} else
					System.out.println("Stacks Are Not Equal");
				break;
			case 5:
				return;

			}// end of Switch

		} while (ch != 6);
	}
}