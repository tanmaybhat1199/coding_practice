
public class MainQueue {

	public static void main(String[] args) {
	
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.remove();
		System.out.println(q1);
		q2.insert(5);
		q2.insert(6);
		q2.insert(7);
		q2.insert(9);
		q2.insert(11);
		q2.insert(8);
		System.out.println(q2);
		q2.remove();
		System.out.println(q2);
		Queue q3 =q2.concat(q1);
		System.out.println(q3);
	}

}
