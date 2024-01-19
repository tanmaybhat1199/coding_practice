
public class Main {

	public static void main(String[] args) {
		StackLL s1=new StackLL();
		
		s1.push(new Student("Ram",19,'M'));
		s1.push(new Student("Sham",17,'M'));
		s1.push(new Student("vani",21,'F'));
		//s1.pop();
		Student res=s1.peek();
		System.out.println(res);

	}

}
