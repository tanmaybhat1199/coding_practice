
public class Main {
	
	public static void main(String []args) {
		
		CircularLL L1=new CircularLL();
		Student s1=new Student("Ram",19,'M');
		Student s2=new Student("vani",19,'f');
		Student s3=new Student("Sham",29,'M');
		Student s4=new Student("Gaurav",18,'M');
		Student s5=new Student("rutu",19,'f');
		L1.InsertFirst(s1);
		L1.InsertFirst(s3);
		L1.Append(s2);
		//L1.DeleteFirst();
		//L1.DeleteLast();
		L1.InsertByPos(s5, 3);
		L1.DeleteByPos(2);
		System.out.println(L1);

	}
}