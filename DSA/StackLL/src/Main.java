
public class Main {

	public static void main(String[] args) {
		StackLL s1=new StackLL();
		
		s1.push(10);
		s1.push(50);
		s1.push(44);
		s1.pop();
		int res=s1.peek();
		System.out.println(res);

	}

}
