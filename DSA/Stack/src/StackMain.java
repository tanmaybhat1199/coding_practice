
public class StackMain {

	public static void main(String[] args) {
	
		Stack st=new Stack();
		Student s1 = new Student("Ram",18,'M');
		Student s2 = new Student("Sham",19,'M');
		Student s3 = new Student("Girl",21,'F');
		
		
		st.push(s1);
		st.push(s2);
		st.push(s3);
		st.pop();		
		System.out.print("Stack1:"+st);
		Stack st1=new Stack();
		st1.push(s1);
		st1.push(s3);
		System.out.println("Stack2:"+st1);
		Stack st2=st1.concate(st);
		System.out.println("Concate:"+st2);
		if(st1.equals(st2))
		{
			System.out.println("Stacks Are Equal");
		}
		else
			System.out.println("Stacks Are Not Equal");
		
		
		
		
		
		

	}

}
