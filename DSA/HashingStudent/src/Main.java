
public class Main {

	public static void main(String[] args) {
		Hashing hash=new Hashing(29);
		Student s1=new Student("Abc",19,'M',729474734);
		Student s2=new Student("Def",21,'F',721727283);
		Student s3=new Student("Syz",34,'M',784743628);
		Student s4=new Student("Pqr",17,'M',976625559);
		Student s5=new Student("Def",21,'F',721727283);
		Student s6=new Student("Dsjshsh",21,'M',721727283);
		hash.Insert(s5);
		hash.Insert(s1);
		hash.Insert(s4);
		hash.Insert(s2);
		hash.Insert(s5);
		System.out.println(hash);
		hash.Delete(s4);
		hash.Delete(s6);
		System.out.println(hash);

	}

}
