
public class RecExp2 {
	public static void main(String[] args) {
		fun(0);
	}

	public static void fun(int a) {

		if (a < 5) {
			
			
			for (int i = 0; i < a; i++) {

				System.out.print("*");
			}
			System.out.println();
			a = a + 1;
			fun(a);
			for (int i = 0; i < a; i++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}
