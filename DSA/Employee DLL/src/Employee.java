
public class Employee {
	private int age;
	private String name;
	private float salary;
	
	public Employee() {
		this.age=0;
		this.name="a";
		this.salary=0.0f;
	}
	

	public Employee(String n,int a,float s) {
		this.age=a;
		this.name=n;
		this.salary=s;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		String str=new String("Age:"+ age + " Name:"+ name + " Salary"+ salary + "\n");
		return str;
	}
	
}
