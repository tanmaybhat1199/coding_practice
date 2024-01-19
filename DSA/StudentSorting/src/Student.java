
public class Student {
		
		private String name;
		private int age;
		private char gender;

		public Student() {
			this.name="";
			this.age=0;
			this.gender = 'M';
		}
		
		public Student(String n) {
			this.name=n;
			this.age=0;
			this.gender = 'M';
		}
		
		public Student(String n,int a, char g) {
			this.name=n.toUpperCase();
			this.age=a;
			this.gender = g ;
		}
		
		void print()
		{
			System.out.println(name + "," + age +"," + gender);
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

		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
	}



