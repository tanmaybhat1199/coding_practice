
public class Student {
	private String name;
	private int age;
	private char gender;
	
	public Student(String n,int a,char j) {name=n; age=a; gender=j;}
	
	public String toString()
	{
		String str = new String(name + ":" + age + ":" + gender);
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
