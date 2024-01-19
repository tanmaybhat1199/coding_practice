
public class RecExp1 {
	public static void main(String[] args) {
		int i = 1;
		int b=1;
		fun(1);
		System.out.print(b);

	}

	static void fun(int a) {
		if (a < 5) {
			System.out.print(a+" ");
			a = a + 1;
			fun(a);
			System.out.print(a + " ");
		}
		

	}
}
