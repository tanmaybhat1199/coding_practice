
public class Main {

	public static void main(String[] args) {
	
		QueueLL q1=new QueueLL();
		
		q1.Append(135);
		q1.Append(12);
		q1.Append(319);
		int res=q1.peek();
		System.out.println(res);
		q1.DelFirst();
		res=q1.peek();
		System.out.println(res);

	}

}
