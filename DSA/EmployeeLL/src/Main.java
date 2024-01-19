

public class Main {
	
	public static void main(String []args)
	{
		LinkedList ll=new LinkedList();

		Employee e1=new Employee(10,"Ram",30000);
		Employee e2=new Employee(15,"vani",41000);
		Employee e3=new Employee(22,"Ramesh",35000);
		Employee e4=new Employee(28,"Sham",30900);
		Employee e5=new Employee(30,"Suresh",32500);
		
		ll.insert(e1);
		ll.insert(e4);
		ll.append(e3);
		ll.deletelast();
		System.out.println(ll);
	
		
		
	}

}
