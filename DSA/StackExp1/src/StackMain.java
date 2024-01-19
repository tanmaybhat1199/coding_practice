
public class StackMain {
	
	public static void main(String []args) {

	Stack s1 = new Stack();
	Stack s2 = new Stack();
	s1.push(10);
	s1.push(14);
	s1.push(54);
	s1.push(11);
	s1.pop();
	s2.push(12);
	s2.push(67);
	System.out.println("Stack 1:" + s1);
	System.out.println("Stack 2:" + s2);
	Stack s3 =s1.concate(s2);
	System.out.println("Stack 3:" + s3);
	if(s1.equal(s2))
		System.out.println("S1 Equal S2");
	else
		System.out.println("S1 Is Not Equal S2");

}
}
